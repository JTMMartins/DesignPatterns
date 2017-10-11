package CompositePattern.CompositeDemoONE;

public class App {

    public static void main(String[] args) {

        HtmlTag rootHtmlTag = new HtmlCompositeElement("<html>"); // O elemento mais externo
        rootHtmlTag.setStartTag("<html>");
        rootHtmlTag.setEndTag("</html>");

        HtmlTag bodyHtmlTag = new HtmlCompositeElement("<body>");
        bodyHtmlTag.setStartTag("<body>");
        bodyHtmlTag.setEndTag("</body>");

        rootHtmlTag.addChildTag(bodyHtmlTag); // entra no elemento RootHtml

        HtmlTag tableHtmlTag = new HtmlCompositeElement("<table>");
        tableHtmlTag.setStartTag("<table>");
        tableHtmlTag.setEndTag("</table>");

        bodyHtmlTag.addChildTag(tableHtmlTag); // entra no elemento BodyHtml

        HtmlTag tableRowElement = new HtmlCompositeElement("<tr>");
        tableRowElement.setStartTag("<tr>");
        tableRowElement.setEndTag("</tr>");

        tableHtmlTag.addChildTag(tableRowElement); //Entra no elemento Table

        HtmlTag tableHeaderOne = new HtmlCompositeElement("<th>");
        tableHeaderOne.setStartTag("<th>");
        tableHeaderOne.setEndTag("</th>");

        tableRowElement.addChildTag(tableHeaderOne); // Entra no elemento TableRow

        HtmlTag column1 = new HtmlLeafElement("");
        column1.setStartTag("");
        column1.setEndTag("");
        column1.setTagBody("NOME");

        tableHeaderOne.addChildTag(column1); // entra no elemento TableHeaderOne..é um Elemento Leaf...fim deste ramo

        HtmlTag tableHeaderTwo = new HtmlCompositeElement("<th>");
        tableHeaderTwo.setStartTag("<th>");
        tableHeaderTwo.setEndTag("</th>");

        tableRowElement.addChildTag(tableHeaderTwo); // Entra no elemento TableRow

        HtmlTag column2 = new HtmlLeafElement("");
        column2.setStartTag("");
        column2.setEndTag("");
        column2.setTagBody("TELEFONE");
        tableHeaderTwo.addChildTag(column2); // Entra no elemento TableHeader2..é um elemento Leaf. Fim deste Ramo

        rootHtmlTag.generateHtml();

    }
}
