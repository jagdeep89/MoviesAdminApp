/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviesadminapp.resources;

import com.mycompany.moviessoap.MovieType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * @author forev
 */
@XmlRootElement(name = "NewDataSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class NewDataSet {

    @XmlElement(name = "Table")
    private List<MovieType> tableList;

    public List<MovieType> getTableList() {
        return tableList;
    }

    public void setTableList(List<MovieType> tableList) {
        this.tableList = tableList;
    }
}
