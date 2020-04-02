
package com.mycompany.moviessoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MoviesWebService", targetNamespace = "http://moviessoap.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MoviesWebService {


    /**
     * 
     * @param movie
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "ResponseMessage", targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.AddMovieResponse")
    @Action(input = "http://moviessoap.mycompany.com/MoviesWebService/addMovieRequest", output = "http://moviessoap.mycompany.com/MoviesWebService/addMovieResponse")
    public String addMovie(
        @WebParam(name = "Movie", targetNamespace = "")
        MovieType movie);

    /**
     * 
     * @param movieName
     * @return
     *     returns com.mycompany.moviessoap.MovieType
     */
    @WebMethod
    @WebResult(name = "Movie", targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.GetMovieResponse")
    @Action(input = "http://moviessoap.mycompany.com/MoviesWebService/getMovieRequest", output = "http://moviessoap.mycompany.com/MoviesWebService/getMovieResponse")
    public MovieType getMovie(
        @WebParam(name = "MovieName", targetNamespace = "")
        int movieName);

    /**
     * 
     * @return
     *     returns com.mycompany.moviessoap.MoviesType
     */
    @WebMethod
    @WebResult(name = "Movies", targetNamespace = "")
    @RequestWrapper(localName = "getAllMovies", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.GetAllMovies")
    @ResponseWrapper(localName = "getAllMoviesResponse", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.GetAllMoviesResponse")
    @Action(input = "http://moviessoap.mycompany.com/MoviesWebService/getAllMoviesRequest", output = "http://moviessoap.mycompany.com/MoviesWebService/getAllMoviesResponse")
    public MoviesType getAllMovies();

    /**
     * 
     * @param movieID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "ResponseMessage", targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.DeleteMovieResponse")
    @Action(input = "http://moviessoap.mycompany.com/MoviesWebService/deleteMovieRequest", output = "http://moviessoap.mycompany.com/MoviesWebService/deleteMovieResponse")
    public String deleteMovie(
        @WebParam(name = "MovieID", targetNamespace = "")
        int movieID);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "ResponseMessage", targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://moviessoap.mycompany.com/", className = "com.mycompany.moviessoap.UpdateMovieResponse")
    @Action(input = "http://moviessoap.mycompany.com/MoviesWebService/updateMovieRequest", output = "http://moviessoap.mycompany.com/MoviesWebService/updateMovieResponse")
    public String updateMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        MovieType arg0);

}
