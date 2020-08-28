//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:41:50 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.rapportoVersamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SIPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URNIndiceSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashIndiceSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlgoritmoHashIndiceSIP" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="EncodingHashIndiceSIP" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="URNPISIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HashPISIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlgoritmoHashPISIP" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="EncodingHashPISIP" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="DataVersamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UnitaDocumentaria" type="{}UnitaDocumentariaSIPType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIPType", propOrder = {
    "urnIndiceSIP",
    "hashIndiceSIP",
    "algoritmoHashIndiceSIP",
    "encodingHashIndiceSIP",
    "urnpisip",
    "hashPISIP",
    "algoritmoHashPISIP",
    "encodingHashPISIP",
    "dataVersamento",
    "unitaDocumentaria"
})
public class SIPType {

    @XmlElement(name = "URNIndiceSIP")
    protected String urnIndiceSIP;
    @XmlElement(name = "HashIndiceSIP")
    protected String hashIndiceSIP;
    @XmlElement(name = "AlgoritmoHashIndiceSIP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String algoritmoHashIndiceSIP;
    @XmlElement(name = "EncodingHashIndiceSIP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String encodingHashIndiceSIP;
    @XmlElement(name = "URNPISIP")
    protected String urnpisip;
    @XmlElement(name = "HashPISIP")
    protected String hashPISIP;
    @XmlElement(name = "AlgoritmoHashPISIP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String algoritmoHashPISIP;
    @XmlElement(name = "EncodingHashPISIP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String encodingHashPISIP;
    @XmlElement(name = "DataVersamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVersamento;
    @XmlElement(name = "UnitaDocumentaria")
    protected UnitaDocumentariaSIPType unitaDocumentaria;

    /**
     * Gets the value of the urnIndiceSIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURNIndiceSIP() {
        return urnIndiceSIP;
    }

    /**
     * Sets the value of the urnIndiceSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURNIndiceSIP(String value) {
        this.urnIndiceSIP = value;
    }

    /**
     * Gets the value of the hashIndiceSIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashIndiceSIP() {
        return hashIndiceSIP;
    }

    /**
     * Sets the value of the hashIndiceSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashIndiceSIP(String value) {
        this.hashIndiceSIP = value;
    }

    /**
     * Gets the value of the algoritmoHashIndiceSIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgoritmoHashIndiceSIP() {
        return algoritmoHashIndiceSIP;
    }

    /**
     * Sets the value of the algoritmoHashIndiceSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgoritmoHashIndiceSIP(String value) {
        this.algoritmoHashIndiceSIP = value;
    }

    /**
     * Gets the value of the encodingHashIndiceSIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingHashIndiceSIP() {
        return encodingHashIndiceSIP;
    }

    /**
     * Sets the value of the encodingHashIndiceSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingHashIndiceSIP(String value) {
        this.encodingHashIndiceSIP = value;
    }

    /**
     * Gets the value of the urnpisip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURNPISIP() {
        return urnpisip;
    }

    /**
     * Sets the value of the urnpisip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURNPISIP(String value) {
        this.urnpisip = value;
    }

    /**
     * Gets the value of the hashPISIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashPISIP() {
        return hashPISIP;
    }

    /**
     * Sets the value of the hashPISIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashPISIP(String value) {
        this.hashPISIP = value;
    }

    /**
     * Gets the value of the algoritmoHashPISIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgoritmoHashPISIP() {
        return algoritmoHashPISIP;
    }

    /**
     * Sets the value of the algoritmoHashPISIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgoritmoHashPISIP(String value) {
        this.algoritmoHashPISIP = value;
    }

    /**
     * Gets the value of the encodingHashPISIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingHashPISIP() {
        return encodingHashPISIP;
    }

    /**
     * Sets the value of the encodingHashPISIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingHashPISIP(String value) {
        this.encodingHashPISIP = value;
    }

    /**
     * Gets the value of the dataVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVersamento() {
        return dataVersamento;
    }

    /**
     * Sets the value of the dataVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVersamento(XMLGregorianCalendar value) {
        this.dataVersamento = value;
    }

    /**
     * Gets the value of the unitaDocumentaria property.
     * 
     * @return
     *     possible object is
     *     {@link UnitaDocumentariaSIPType }
     *     
     */
    public UnitaDocumentariaSIPType getUnitaDocumentaria() {
        return unitaDocumentaria;
    }

    /**
     * Sets the value of the unitaDocumentaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitaDocumentariaSIPType }
     *     
     */
    public void setUnitaDocumentaria(UnitaDocumentariaSIPType value) {
        this.unitaDocumentaria = value;
    }

}