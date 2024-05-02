package br.com.weblivraria.services;

import java.io.IOException;

import br.com.weblivraria.dao.DAODetalhe;
import br.com.weblivraria.dao.DAOPedido;
import br.com.weblivraria.dominio.DetalhePedido;
import br.com.weblivraria.dominio.Pedido;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServicePagamento
 */
public class ServiceFinalizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceFinalizar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt-br\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Home Livraria</title>\r\n"
				+ "    \r\n"
				+ "    <style>\r\n"
				+ "        body{\r\n"
				+ "            margin: 0px;\r\n"
				+ "            padding: 0px;\r\n"
				+ "            \r\n"
				+ "        }\r\n"
				+ "        header{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            color: #84847c;\r\n"
				+ "            font-family: sans-serif;\r\n"
				+ "        }\r\n"
				+ "        #areausuario{\r\n"
				+ "            padding: 15px;\r\n"
				+ "            border-bottom: 1px solid silver ;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa{\r\n"
				+ "        display: flex;\r\n"
				+ "        justify-content: center;\r\n"
				+ "        align-items: center;\r\n"
				+ "        height: 100px;\r\n"
				+ "        border-bottom: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ "        #localizacao img{\r\n"
				+ "            width: 16px;\r\n"
				+ "            height: 16px;\r\n"
				+ "        }\r\n"
				+ "        #usuario img{\r\n"
				+ "            height: 20px;\r\n"
				+ "            width: 20px;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa img{\r\n"
				+ "            width: 320px;\r\n"
				+ "            height: 200px;\r\n"
				+ "        }\r\n"
				+ "        #carrinho img{\r\n"
				+ "            height: 25px;\r\n"
				+ "            width: 25px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        form img{\r\n"
				+ "            width: 16px !important;\r\n"
				+ "            height: 16px !important;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        form{\r\n"
				+ "            background-color: whitesmoke;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-left: 80px;\r\n"
				+ "            margin-right: 80px;\r\n"
				+ "        }\r\n"
				+ "        input[type=text]{\r\n"
				+ "            width: 700px;\r\n"
				+ "            border: 0px;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            outline: none;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"submit\"]{\r\n"
				+ "            background-color: #84847c;\r\n"
				+ "            color: whitesmoke;\r\n"
				+ "            border: 0px;\r\n"
				+ "            font-size: 12pt;\r\n"
				+ "            font-family: sans-serif;\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "        #carrinho{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            padding: 15px;\r\n"
				+ "            color: #84847c;\r\n"
				+ "        }\r\n"
				+ "        #areamenu{\r\n"
				+ "            padding: 15px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a{\r\n"
				+ "            color: #84847c;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            margin-left: 10px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a:hover{\r\n"
				+ "            color: olive;\r\n"
				+ "        }\r\n"
				+ "        footer{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            color: #84847c;\r\n"
				+ "            font-family: sans-serif;\r\n"
				+ "            padding: 40px;\r\n"
				+ "        }\r\n"
				+ "        #rodape h2{\r\n"
				+ "            color: #84847c;\r\n"
				+ "        }\r\n"
				+ "        #rodape{\r\n"
				+ "            line-height: 30px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        footer a{\r\n"
				+ "            color: olive;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "        }\r\n"
				+ "        #contato a{\r\n"
				+ "            display: flex;\r\n"
				+ "            align-items: center;\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "        #contato img{\r\n"
				+ "            width: 25px;\r\n"
				+ "            height: 25px;\r\n"
				+ "        }\r\n"
				+ "        #generos a{\r\n"
				+ "            display: block;\r\n"
				+ "        }\r\n"
				+ "        #generos{\r\n"
				+ "            width: 400px;\r\n"
				+ "        }\r\n"
				+ "        #copy{\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-top: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ ".pagamento{"
				+ "display:flex;"
				+ "margin:30px;"
				+ "padding:20px;"
				+ "border:1px solid #eee;"
				+ "justify-content:space-between;"
				+ "align-items:center;"
				+ "font-family: verdana;"
				+ "font-size: 10;"
				+ "}"
				+ ".pagamento img{"
				+ "width:80px;"
				+ "height:110px;"
				+ "margin:10px;"
				+ "}"
				+ ".pag label{"
				+ "margin-right:20px;"
				+ "font-weight:bold;"
				+ "}"
				+ ".pagamento input[type=number]{"
				+ "margin-right:30px;"
				+ "}"
				+ ".pagamento button{"
				+ "background-color: #e4e6da;"
				+ "color: black;"
				+ "border: 0px;"
				+ "padding: 10px;"
				+ "margin-left: 30px;"
				+ "}"
				+ ".pagamento .pag{"
				+ "text-decoration:none;"
				+ "background-color: limegreen;"
				+ "color: white;"
				+ "padding:10px;"
				+ "font-weight:bold;"
				+ "</style>\r\n"
				+ "\r\n"
				+ "<script>\r\n"
				+ "        function subtotal(){\r\n"
				+ "            var preco = document.getElementById(\"preco\").innerText;\r\n"
				+ "            var qtd = document.getElementById(\"qtd\").value;\r\n"
				+ "        document.getElementById(\"resultado\").innerText=preco*qtd;\r\n"
				+ "        }\r\n"
				+ "    </script>"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <div id =\"areausuario\">\r\n"
				+ "            <div id =\"localizacao\">\r\n"
				+ "                <img src=\"location.png\" alt=\"\">\r\n"
				+ "                Localização da loja\r\n"
				+ "            </div>\r\n"
				+ "            <div id =\"usuario\">\r\n"
				+ "                <img src=\"login.png\" alt=\"\">\r\n"
				+ "                Logar / Cadastrar\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "        <div id =\"areapesquisa\">\r\n"
				+ "            <img src=\"magicbooklibrary.png\" alt=\"\">\r\n"
				+ "            <form action=\"ServiceSearch\" method=\"get\">\r\n"
				+ "                <img src=\"lupinha.png\" alt=\"\">\r\n"
				+ "                <input type=\"text\" placeholder=\"Pesquise seu livro aqui\">\r\n"
				+ "                <input type=\"submit\" value=\"BUSCAR\">\r\n"
				+ "            </form>\r\n"
				+ "\r\n"
				+ "            <div id=\"carrinho\"><img src=\"carrinho.png\" alt=\"\">R$ 0,00</div>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "        <div id =\"areamenu\">\r\n"
				+ "\r\n"
				+ "            <nav>\r\n"
				+ "                <a href=\"HOME\">HOME</a>\r\n"
				+ "                <a href=\"#\">ROMANCE</a>\r\n"
				+ "                <a href=\"#\">AVENTURA</a>\r\n"
				+ "                <a href=\"#\">TERROR</a>\r\n"
				+ "                <a href=\"#\">FANTASIA</a>\r\n"
				+ "                <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                <a href=\"#\">DRAMA</a>\r\n"
				+ "                <a href=\"#\">AÇAO</a>\r\n"
				+ "            </nav>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "    </header>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    <content>\r\n"
				+ "        <div id=\"painel\"><img src=\"painel.avif\" alt=\"\"></div>\r\n"
				+ "        <h2>Nossos Produtos</h2>\r\n"
				+ "        <div id=\"listalivros\">\r\n"
				;
				
		
				String livro_id = request.getParameter("idlivro");
				String qtd = request.getParameter("qtd");
				String subtotal = request.getParameter("subtotal");
			
				String conteudo = "";
				
				Pedido pd = new Pedido();
				DAOPedido dp = new DAOPedido();
				pd.setIdusuario(1);
				pd.setTotalpedido(Double.parseDouble(subtotal));
				
				if(dp.cadastrar(pd).equals("Pedido efetuado")) {
					conteudo+="<h2>Pedido Efetuado com sucesso!</h2>";
					
					DetalhePedido detalhe = new DetalhePedido();
					detalhe.setIdpedido(1);
					detalhe.setIdlivro(Integer.parseInt(livro_id));
					detalhe.setQuantidade(Integer.parseInt(qtd));
					detalhe.setPrecototal(Double.parseDouble(subtotal));
					
					DAODetalhe dd = new DAODetalhe();
					System.out.println(dd.cadastrar(detalhe));
					
				}
				else {
					conteudo+="<h2>Pedido não realizado</h2>";
				}
				
				pagina+=conteudo;
		
		
		
		pagina+= "        </div>\r\n"
				+ "\r\n"
				+ "    </content>\r\n"
				+ "    <footer>\r\n"
				+ "\r\n"
				+ "        <div id=\"rodape\">\r\n"
				+ "            <div id =\"contato\">\r\n"
				+ "                <h2>Nossos Contatos</h2>\r\n"
				+ "                (11) 93716-3109 <br>\r\n"
				+ "                Av. Doutor Paulo Roberto, 78 - Jardim Aurora - São Paulo - SP <br>\r\n"
				+ "                <a href=\"https://wa.me/551187350294\"><img src=\"whatsapp.png\" alt=\"\">(11) 8735-0294</a>\r\n"
				+ "\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "            <div id =\"generos\">\r\n"
				+ "                <h2>Generos</h2>\r\n"
				+ "                <nav>\r\n"
				+ "                    <a href=\"HOME\">HOME</a>\r\n"
				+ "                    <a href=\"#\">ROMANCE</a>\r\n"
				+ "                    <a href=\"#\">AVENTURA</a>\r\n"
				+ "                    <a href=\"#\">TERROR</a>\r\n"
				+ "                    <a href=\"#\">FANTASIA</a>\r\n"
				+ "                    <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                    <a href=\"#\">DRAMA</a>\r\n"
				+ "                    <a href=\"#\">AÇAO</a>\r\n"
				+ "                </nav>\r\n"
				+ "\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id=\"copy\">\r\n"
				+ "            ©Copyrigth-todos os direitos reservados | design by <a href=\\\"https://github.com/gessicamilla/WebLivraria\\\">Géssica Rodrigues</a></div>\r\n"
				+ "\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		response.getWriter().append(pagina);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
