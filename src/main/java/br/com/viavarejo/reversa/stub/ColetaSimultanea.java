//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.09.19 �s 02:10:34 PM BRT 
//


package br.com.viavarejo.reversa.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de coletaSimultanea complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="coletaSimultanea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.logisticareversa.correios.com.br/}coleta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaSimultanea", propOrder = {
    "obs",
    "obj"
})
public class ColetaSimultanea
    extends Coleta
{

    protected String obs;
    protected String obj;

    /**
     * Obt�m o valor da propriedade obs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Define o valor da propriedade obs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

    /**
     * Obt�m o valor da propriedade obj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObj() {
        return obj;
    }

    /**
     * Define o valor da propriedade obj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObj(String value) {
        this.obj = value;
    }

}
