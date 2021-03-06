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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RapportoVersamentoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RapportoVersamentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Versione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URNRapportoVersamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataRapportoVersamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EsitoGenerale" type="{}ECEsitoGeneraleType"/>
 *         &lt;element name="WarningUlteriori" type="{}ECWarningSecondariType" minOccurs="0"/>
 *         &lt;element name="Versatore" type="{}SCVersatoreType" minOccurs="0"/>
 *         &lt;element name="SIP" type="{}SIPType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RapportoVersamentoType", propOrder = {
    "versione",
    "urnRapportoVersamento",
    "dataRapportoVersamento",
    "esitoGenerale",
    "warningUlteriori",
    "versatore",
    "sip"
})
public class RapportoVersamentoType {

    @XmlElement(name = "Versione")
    protected String versione;
    @XmlElement(name = "URNRapportoVersamento", required = true)
    protected String urnRapportoVersamento;
    @XmlElement(name = "DataRapportoVersamento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRapportoVersamento;
    @XmlElement(name = "EsitoGenerale", required = true)
    protected ECEsitoGeneraleType esitoGenerale;
    @XmlElement(name = "WarningUlteriori")
    protected ECWarningSecondariType warningUlteriori;
    @XmlElement(name = "Versatore")
    protected SCVersatoreType versatore;
    @XmlElement(name = "SIP")
    protected SIPType sip;

    /**
     * Gets the value of the versione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        return versione;
    }

    /**
     * Sets the value of the versione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

    /**
     * Gets the value of the urnRapportoVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURNRapportoVersamento() {
        return urnRapportoVersamento;
    }

    /**
     * Sets the value of the urnRapportoVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURNRapportoVersamento(String value) {
        this.urnRapportoVersamento = value;
    }

    /**
     * Gets the value of the dataRapportoVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRapportoVersamento() {
        return dataRapportoVersamento;
    }

    /**
     * Sets the value of the dataRapportoVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRapportoVersamento(XMLGregorianCalendar value) {
        this.dataRapportoVersamento = value;
    }

    /**
     * Gets the value of the esitoGenerale property.
     * 
     * @return
     *     possible object is
     *     {@link ECEsitoGeneraleType }
     *     
     */
    public ECEsitoGeneraleType getEsitoGenerale() {
        return esitoGenerale;
    }

    /**
     * Sets the value of the esitoGenerale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECEsitoGeneraleType }
     *     
     */
    public void setEsitoGenerale(ECEsitoGeneraleType value) {
        this.esitoGenerale = value;
    }

    /**
     * Gets the value of the warningUlteriori property.
     * 
     * @return
     *     possible object is
     *     {@link ECWarningSecondariType }
     *     
     */
    public ECWarningSecondariType getWarningUlteriori() {
        return warningUlteriori;
    }

    /**
     * Sets the value of the warningUlteriori property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECWarningSecondariType }
     *     
     */
    public void setWarningUlteriori(ECWarningSecondariType value) {
        this.warningUlteriori = value;
    }

    /**
     * Gets the value of the versatore property.
     * 
     * @return
     *     possible object is
     *     {@link SCVersatoreType }
     *     
     */
    public SCVersatoreType getVersatore() {
        return versatore;
    }

    /**
     * Sets the value of the versatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCVersatoreType }
     *     
     */
    public void setVersatore(SCVersatoreType value) {
        this.versatore = value;
    }

    /**
     * Gets the value of the sip property.
     * 
     * @return
     *     possible object is
     *     {@link SIPType }
     *     
     */
    public SIPType getSIP() {
        return sip;
    }

    /**
     * Sets the value of the sip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIPType }
     *     
     */
    public void setSIP(SIPType value) {
        this.sip = value;
    }

}
