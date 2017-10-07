package CompositePattern;

import java.util.List;


public abstract class HtmlTag {

    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Operacão não suportada neste objecto");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Operacão não suportada neste objecto");
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Operacão não suportada neste objecto");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Operacão não suportada neste objecto");
    }

    public abstract void generateHtml();

}
