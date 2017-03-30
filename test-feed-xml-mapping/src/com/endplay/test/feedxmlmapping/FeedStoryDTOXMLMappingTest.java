package com.endplay.test.feedxmlmapping;


import com.endplay.feeds.jobs.dto.InBoundWireFeedDTO;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.JAXBContextFactory;


public class FeedStoryDTOXMLMappingTest {
    
    /*This is feed XML mapping*/
    private static File xmlmapping = new File("resource/feedstorydto(ap)_feedmapping.xml");
    
    /*This is feed XML source*/
    private static File xmlsource = new File("resource/feedstorydto(ap)_source.xml");

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Map<String, Object> properties = new HashMap<String, Object>(1);
        //properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, xmlmapping);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, xmlmapping);
        JAXBContext jc = JAXBContext.newInstance("com.endplay.feeds.jobs.dto", InBoundWireFeedDTO.class.getClassLoader(), properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        //unmarshal ROOT entry.
        InBoundWireFeedDTO feedRootDTO = (InBoundWireFeedDTO) unmarshaller.unmarshal(xmlsource);
        
        System.out.println(feedRootDTO);

    }

}
