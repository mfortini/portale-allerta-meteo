//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:46:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsEsitoUnico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECEsitoChiamataWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECEsitoChiamataWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersioneWSCorretta" type="{}ECEsitoPosNegType"/>
 *         &lt;element name="CredenzialiOperatore" type="{}ECEsitoPosNegType"/>
 *         &lt;element name="FileAttesiRicevuti" type="{}ECEsitoPosNegType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECEsitoChiamataWSType", propOrder = {
    "versioneWSCorretta",
    "credenzialiOperatore",
    "fileAttesiRicevuti"
})
public class ECEsitoChiamataWSType {

    @XmlElement(name = "VersioneWSCorretta", required = true)
    protected ECEsitoPosNegType versioneWSCorretta;
    @XmlElement(name = "CredenzialiOperatore", required = true)
    protected ECEsitoPosNegType credenzialiOperatore;
    @XmlElement(name = "FileAttesiRicevuti", required = true)
    protected ECEsitoPosNegType fileAttesiRicevuti;

    /**
     * Gets the value of the versioneWSCorretta property.
     * 
     * @return
     *     possible object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public ECEsitoPosNegType getVersioneWSCorretta() {
        return versioneWSCorretta;
    }

    /**
     * Sets the value of the versioneWSCorretta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public void setVersioneWSCorretta(ECEsitoPosNegType value) {
        this.versioneWSCorretta = value;
    }

    /**
     * Gets the value of the credenzialiOperatore property.
     * 
     * @return
     *     possible object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public ECEsitoPosNegType getCredenzialiOperatore() {
        return credenzialiOperatore;
    }

    /**
     * Sets the value of the credenzialiOperatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public void setCredenzialiOperatore(ECEsitoPosNegType value) {
        this.credenzialiOperatore = value;
    }

    /**
     * Gets the value of the fileAttesiRicevuti property.
     * 
     * @return
     *     possible object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public ECEsitoPosNegType getFileAttesiRicevuti() {
        return fileAttesiRicevuti;
    }

    /**
     * Sets the value of the fileAttesiRicevuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECEsitoPosNegType }
     *     
     */
    public void setFileAttesiRicevuti(ECEsitoPosNegType value) {
        this.fileAttesiRicevuti = value;
    }

}