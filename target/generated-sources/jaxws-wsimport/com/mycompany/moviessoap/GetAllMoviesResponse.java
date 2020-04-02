
package com.mycompany.moviessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllMoviesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllMoviesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Movies" type="{http://moviessoap.mycompany.com/}MoviesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMoviesResponse", propOrder = {
    "movies"
})
public class GetAllMoviesResponse {

    @XmlElement(name = "Movies")
    protected MoviesType movies;

    /**
     * Gets the value of the movies property.
     * 
     * @return
     *     possible object is
     *     {@link MoviesType }
     *     
     */
    public MoviesType getMovies() {
        return movies;
    }

    /**
     * Sets the value of the movies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoviesType }
     *     
     */
    public void setMovies(MoviesType value) {
        this.movies = value;
    }

}
