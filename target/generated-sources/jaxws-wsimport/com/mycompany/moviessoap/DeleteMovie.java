
package com.mycompany.moviessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovieID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMovie", propOrder = {
    "movieID"
})
public class DeleteMovie {

    @XmlElement(name = "MovieID")
    protected int movieID;

    /**
     * Gets the value of the movieID property.
     * 
     */
    public int getMovieID() {
        return movieID;
    }

    /**
     * Sets the value of the movieID property.
     * 
     */
    public void setMovieID(int value) {
        this.movieID = value;
    }

}
