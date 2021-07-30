package io.inout.java.hjello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<ANKIT> topics=new ArrayList<>(Arrays.asList( 
			new ANKIT("name","abc"),
			new ANKIT("nae","wre"),
			new ANKIT("na","qq")
			));
	public List<ANKIT> getTopic() {
	    return topics;
	}
	
	public ANKIT getsingletopic(String id){
		return topics.stream().filter(i ->i.getAge().equals(id)).findFirst().get();
	}
	public void add(ANKIT ankit){
		topics.add(ankit);
	}

	public void update(ANKIT ankit, String id) {
		for (int i=0; i<topics.size();i++) {
			if(topics.get(i).getAge().equals(id)) {
				topics.set(i, ankit );
			}
		}
	}

	public void deletetopic(String id) {
		for (int i=0; i<topics.size();i++) {
			if(topics.get(i).getAge().equals(id)) {
				topics.remove(i);
			}
		}
		
	}

	
	
}
