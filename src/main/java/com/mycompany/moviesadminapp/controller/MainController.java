/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesadminapp.controller;

import com.mycompany.moviesadminapp.resources.NewDataSet;
import com.mycompany.moviessoap.MovieType;
import com.mycompany.moviessoap.MoviesWebService;
import com.mycompany.moviessoap.MoviesWebServiceService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author forev
 */
@Controller
public class MainController {

    Logger log = Logger.getLogger(MainController.class.getName());

    private final static String STR_URL_="http://localhost:8080/MoviesSoap/MoviesWebServiceService?wsdl";

    @GetMapping(value = "/")
    public String showHomePage(){
        return "index";
    }


    @PostMapping(value = "/getMovie")
    public String getMoviesById(@RequestParam int idContent, Model model) throws JAXBException {

        MovieType response=null;
        MoviesWebService port=portInit();
        if(port!=null){

            response=port.getMovie(idContent);
            if(response.getTitle()==null || response.getTitle().compareTo("")==0){
                return "error";
            }

            log.info("Init Response : "+response.getTitle());

            //response=response.replaceAll("string","");
            log.info("Modified response : "+response.getTitle());

            JAXBContext jaxbContext = JAXBContext.newInstance(NewDataSet.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(response.getTitle());
            NewDataSet movies = (NewDataSet) unmarshaller.unmarshal(reader);

            for(MovieType movie:movies.getTableList()){
                log.info("Movie : "+movie.getTitle());
            }

            model.addAttribute("movies",movies.getTableList());
            model.addAttribute("IdContent",idContent);

        }else{
            return "error";
        }

        return "result";

    }

    private MoviesWebService portInit(){
        MoviesWebService port=null;
        try {
            URL url=new URL(STR_URL_);
            MoviesWebServiceService service=new MoviesWebServiceService();
            port=service.getMoviesWebServicePort();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            log.error(e.toString(),e);
        }

        return port;

    }

}
