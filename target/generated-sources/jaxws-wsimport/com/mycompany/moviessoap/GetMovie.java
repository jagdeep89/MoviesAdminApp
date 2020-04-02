
package com.mycompany.moviessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovieName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMovie", propOrder = {
    "movieName"
})
public class GetMovie {

    @XmlElement(name = "MovieName")
    protected int movieName;

    /**
     * Gets the value of the movieName property.
     * 
     */
    public int getMovieName() {
        return movieName;
    }

    /**
     * Sets the value of the movieName property.
     * 
     */
    public void setMovieName(int value) {
        this.movieName = value;
    }

}
