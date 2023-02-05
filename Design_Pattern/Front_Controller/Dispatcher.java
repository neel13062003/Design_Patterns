//Dispatcher (central dispatcher class)
package designpattern.frontcontroller;
import java.util.HashMap;
    public class Dispatcher {
        private HashMap<String, View> requestMap= new HashMap<>();
        private HashMap<String, View> errorMap= new HashMap<>();
        public void addRequestMapping(String viewName, View viewObject){
            requestMap.put(viewName, viewObject);
        }
        public void addErrorMapping(String viewName, View viewObject){
            errorMap.put(viewName, viewObject);
        }
        private void trackRequest(String request){
            System.out.println(new Date()+" # Page requested : "+request);
        }
        public void dispatchRequest(String request){
            // Log each incoming request
            trackRequest(request);
            //authenticate the user
            if(isAuthenticUser()){
                dispatcher.dispatchRequest(request);
            }
        }
    }