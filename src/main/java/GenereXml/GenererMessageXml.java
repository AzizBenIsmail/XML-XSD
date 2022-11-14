package GenereXml;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import Entites.Message;


public class GenererMessageXml {
/*public static void main(String[] args) throws JAXBException {
/*Message message = new Message();
message.setFrom("mohamed");
message.setNew(true);
message.setText("hello");
message.setTo("ali");
// création d'un contexte JAXB sur la classe Message
JAXBContext context = JAXBContext.newInstance(Message.class);
// création d'un marshaller à partir de ce contexte
Marshaller marshaller = context.createMarshaller();
// on choisit UTF-8 pour encoder ce fichier
marshaller.setProperty("jaxb.encoding", "UTF-8");

// et l'on demande à JAXB de formatter ce fichier de façon à pouvoir le lire à l'oeil nu

marshaller.setProperty("jaxb.formatted.output", true);
// écriture finale du document XML dans un fichier message.xml
marshaller.marshal(message, new File("message.xml"));
}*/
	public static void main(String[] args) throws JAXBException {
		// création d'un contexte JAXB sur la classe Message
		JAXBContext context = JAXBContext.newInstance(Message.class) ;
		// création d'un unmarshaller
		Unmarshaller unmarshaller = context.createUnmarshaller() ;

		

		Message message= (Message)unmarshaller.unmarshal(new File("message.xml"));
		System.out.println("From = " + message.getFrom());
		System.out.println("To = " + message.getTo()) ;
		System.out.println("Text = " + message.getText()) ;
		}
}