//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:35:07 PM CET 
//


package it.eng.parer.xmlGen.allerta.mail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiSpecificiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiSpecificiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VersioneDatiSpecifici" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="NumeroAllerta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataGenerazione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OggettoMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TestoMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DenominazioneApplicativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiSpecificiType", namespace="am",propOrder = {
    "versioneDatiSpecifici",
    "numeroComunicazione",
    "tipoComunicazione",
    "dataGenerazione",
    "oggettoMail",
    "testoMail",
    "denominazioneApplicativo"
})
public class DatiSpecificiTypeMail {

    @XmlElement(name = "VersioneDatiSpecifici", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String versioneDatiSpecifici;
    @XmlElement(name = "NumeroComunicazione", required = true)
    protected String numeroComunicazione;
    @XmlElement(name = "TipoComunicazione", required = true)
    protected String tipoComunicazione;
    @XmlElement(name = "DataGenerazione", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String dataGenerazione;
    @XmlElement(name = "OggettoMail", required = true)
    protected String oggettoMail;
    @XmlElement(name = "TestoMail", required = true)
    protected String testoMail;
    @XmlElement(name = "DenominazioneApplicativo", required = true)
    protected String denominazioneApplicativo;

    /**
     * Gets the value of the versioneDatiSpecifici property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersioneDatiSpecifici() {
        return versioneDatiSpecifici;
    }

    /**
     * Sets the value of the versioneDatiSpecifici property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersioneDatiSpecifici(String value) {
        this.versioneDatiSpecifici = value;
    }

//    /**
//     * Gets the value of the numeroAllerta property.
//     * 
//     * @return
//     *     possible object is
//     *     {@link String }
//     *     
//     */
//    public String getNumeroAllerta() {
//        return numeroAllerta;
//    }
//
//    /**
//     * Sets the value of the numeroAllerta property.
//     * 
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *     
//     */
//    public void setNumeroAllerta(String value) {
//        this.numeroAllerta = value;
//    }

    /**
     * Gets the value of the dataGenerazione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataGenerazione() {
        return dataGenerazione;
    }

    /**
     * Sets the value of the dataGenerazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataGenerazione(String value) {
        this.dataGenerazione = value;
    }

    /**
     * Gets the value of the oggettoMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoMail() {
        return oggettoMail;
    }

    /**
     * Sets the value of the oggettoMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoMail(String value) {
        this.oggettoMail = value;
    }

    /**
     * Gets the value of the testoMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestoMail() {
        return testoMail;
    }

    /**
     * Sets the value of the testoMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestoMail(String value) {
        this.testoMail = value;
    }

    /**
     * Gets the value of the denominazioneApplicativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneApplicativo() {
        return denominazioneApplicativo;
    }

    /**
     * Sets the value of the denominazioneApplicativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneApplicativo(String value) {
        this.denominazioneApplicativo = value;
    }


    /**
     * Gets the value of the numeroComunicazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComunicazione() {
        return numeroComunicazione;
    }

    /**
     * Sets the value of the numeroComunicazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComunicazione(String value) {
        this.numeroComunicazione = value;
    }

    /**
     * Gets the value of the tipoComunicazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComunicazione() {
        return tipoComunicazione;
    }

    /**
     * Sets the value of the tipoComunicazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComunicazione(String value) {
        this.tipoComunicazione = value;
    }

}
