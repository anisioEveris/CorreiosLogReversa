package br.com.viavarejo.reversa;

import br.com.viavarejo.reversa.stub.*;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

public class API {
    public static void main(String[] args) throws ComponenteException {


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
        destinatario.setCidade("Brasília");
        destinatario.setUf("DF");
        destinatario.setCep("70002900");
        destinatario.setDdd("61");
        destinatario.setTelefone("34261111");
        destinatario.setEmail("filano@mail.com");

        List<ColetaReversa> coletasSolicitadas = new ArrayList<>();
        coletasSolicitadas.add( new ColetaReversa() );

        /*******************UserName & Password ******************************/
//        Map<String, Object> req_ctx = ((BindingProvider)cliente).getRequestContext();
//        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
//
//        Map<String, String> headers = new HashMap<String, String>();
//        headers.put("Username", "empresacws");
//        headers.put("Password", "123456");
//        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);


        /**********************************************************************/


//        var a = cliente.solicitarPostagemReversa("17000190","04677", "0067599079", destinatario, coletasSolicitadas);
        var a = cliente.sobreWebService();
        System.out.println(a.getDataProducao());

    }
}
