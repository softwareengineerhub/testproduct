
package com.app.ws.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="question">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="a2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="a3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="a4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "question", propOrder = {
    "a1",
    "a2",
    "a3",
    "a4",
    "correct",
    "question"
})
public class Question {

    protected String a1;
    protected String a2;
    protected String a3;
    protected String a4;
    protected String correct;
    protected String question;

    /**
     * Gets the value of the a1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA1() {
        return a1;
    }

    /**
     * Sets the value of the a1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA1(String value) {
        this.a1 = value;
    }

    /**
     * Gets the value of the a2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA2() {
        return a2;
    }

    /**
     * Sets the value of the a2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA2(String value) {
        this.a2 = value;
    }

    /**
     * Gets the value of the a3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA3() {
        return a3;
    }

    /**
     * Sets the value of the a3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA3(String value) {
        this.a3 = value;
    }

    /**
     * Gets the value of the a4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA4() {
        return a4;
    }

    /**
     * Sets the value of the a4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA4(String value) {
        this.a4 = value;
    }

    /**
     * Gets the value of the correct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrect() {
        return correct;
    }

    /**
     * Sets the value of the correct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrect(String value) {
        this.correct = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

}
