package io.inout.java.hjello;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@Autowired
	public TopicService topicservice;
	@RequestMapping("/hello")
	public List<ANKIT> getlist(){
		return topicservice.getTopic();
		
	}
	@RequestMapping("/hello/{abc}")	
    public ANKIT getsingletopic(@PathVariable("abc") String id) {
    	return topicservice.getsingletopic(id);
    }		
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void insertTopic(@RequestBody ANKIT ankit) {
		topicservice.add(ankit);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody ANKIT ankit, @PathVariable String id ) {
		topicservice.update(ankit, id);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/hello/{abc}")	
    public void deletetopic(@PathVariable("abc") String id) {
    	 topicservice.deletetopic(id);
    }	
}
