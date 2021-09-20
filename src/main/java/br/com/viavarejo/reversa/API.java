package br.com.viavarejo.reversa;

import br.com.viavarejo.reversa.stub.*;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

public class API {

    public static void main(String[] args) throws ComponenteException {
        com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true;

        Authenticator myAuth = new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("empresacws", "123456".toCharArray());
            }
        };

        Authenticator.setDefault(myAuth);

        LogisticaReversaWS cliente = new LogisticaReversaService().getLogisticaReversaWSPort() ;

//        /*******************UserName & Password ******************************/
//        BindingProvider prov = (BindingProvider)cliente;
//        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "empresacws");
//        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "123456");
//        /*******************UserName & Password ******************************/



        Pessoa destinatario = new Pessoa();
        destinatario.setNome("Fulano");
        destinatario.setLogradouro("SBN");
        destinatario.setNumero("10");
        destinatario.setComplemento("Bloco A");
        destinatario.setBairro("Plano Piloto");
        destinatario.setCidade("Brasilia");
        destinatario.setUf("DF");
        destinatario.setCep("70002900");
        destinatario.setDdd("61");
        destinatario.setTelefone("34261111");
        destinatario.setEmail("filano@mail.com");

        Remetente remetente = new Remetente();
        remetente.setNome("Ciclano da Silva Junior 3");
        remetente.setLogradouro("Rua 35");
        remetente.setNumero("10");
        remetente.setComplemento("Bloco B");
        remetente.setBairro("Aguas Claras(Sul)");
        remetente.setCidade("Brasilia");
        remetente.setUf("DF");
        remetente.setCep("71931180");
        remetente.setDdd("61");
        remetente.setTelefone("34262222");
        remetente.setEmail("ciclano@mail.com");
        remetente.setDddCelular("61");
        remetente.setCelular("92236666");
        remetente.setSms("S");

        Produto produto = new Produto();
        produto.setCodigo("116600063");
        produto.setTipo("0");
        produto.setQtd("1");

        Objeto objeto = new Objeto();
        objeto.setItem("1");
        objeto.setId("553366");

        List<ColetaReversa> coletasSolicitadas = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        List<Objeto> objetos = new ArrayList<>();
        objetos.add(objeto);

        ColetaReversa coletaSolicitada = new ColetaReversa();
        coletaSolicitada.setTipo("A");
        coletaSolicitada.setIdCliente("1133566");
        coletaSolicitada.setValorDeclarado("1500.00");
        coletaSolicitada.setRemetente(remetente);
        coletaSolicitada.setObjCol(objetos);
//        coletaSolicitada.setProduto(produtos);


        coletasSolicitadas.add( coletaSolicitada );

        /*******************UserName & Password ******************************/
//        Map<String, Object> req_ctx = ((BindingProvider)cliente).getRequestContext();
//        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
//
//        Map<String, String> headers = new HashMap<String, String>();
//        headers.put("Username", "empresacws");
//        headers.put("Password", "123456");
//        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);


        /**********************************************************************/



        var a = cliente.solicitarPostagemReversa(
                "17000190","04677", "0067599079", destinatario, coletasSolicitadas);
//        var a = cliente.sobreWebService();
        System.out.println( a.getResultadoSolicitacao().get(0).toString());

    }
}
