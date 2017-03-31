package hello;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }
  
    @RequestMapping(path = "/greeting/{name}")
    public String greeting(@PathVariable(value = "name") String name) {
    return "hello " + name;
    }
    public static void main(String[] args) throws IOException {
    	File file = new File ("test.txt");
    	try (Writer writer =new FileWriter(file, true)){
    	writer.write("Stringi");
    	} catch (IOException ex){
    		ex.printStackTrace();
    	}
    	
    }
}
