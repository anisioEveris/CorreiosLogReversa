
package br.com.viavarejo.reversa.stub;

import br.com.RetornoResumoColeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consultarResumoColetaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultarResumoColetaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarResumoColeta" type="{http://service.logisticareversa.correios.com.br/}retornoResumoColeta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarResumoColetaResponse", propOrder = {
    "consultarResumoColeta"
})
public class ConsultarResumoColetaResponse {

    protected RetornoResumoColeta consultarResumoColeta;

    /**
     * Obtém o valor da propriedade consultarResumoColeta.
     * 
     * @return
     *     possible object is
     *     {@link RetornoResumoColeta }
     *     
     */
    public RetornoResumoColeta getConsultarResumoColeta() {
        return consultarResumoColeta;
    }

    /**
     * Define o valor da propriedade consultarResumoColeta.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoResumoColeta }
     *     
     */
    public void setConsultarResumoColeta(RetornoResumoColeta value) {
        this.consultarResumoColeta = value;
    }

}
