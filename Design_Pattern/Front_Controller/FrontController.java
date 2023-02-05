// FrontController
package designpattern.frontcontroller;
public class FrontController {
    private Dispatcher dispatcher;
        public FrontController(Dispatcher dispatcher){
        this.dispatcher=dispatcher;
    }
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully");
        return true;
    }
}