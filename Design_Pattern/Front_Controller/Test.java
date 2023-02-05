package designpattern.frontcontroller;
    public class Test {
        public static void main(String[] args) {
            System.out.println("Creating dispatcher");
            Dispatcher dispatcher=new Dispatcher();
            System.out.println("Initialize Pages");

            dispatcher.addRequestMapping("STUDENT", new StudentView());
            dispatcher.addRequestMapping("FACULTYMEMBER", newFacultyMemberView());

            System.out.println("Initialize Error Pages");

            dispatcher.addErrorMapping("DEFAULT", new DefaultView());
            dispatcher.addErrorMapping("NOPAGE", new NoPageErrorView());

            FrontController frontController=new FrontController(dispatcher);
            System.out.println("Sending request for page: STUDENT");
            frontController.dispatchRequest("STUDENT");

            System.out.println("Sending request for page: FACULTYMEMBER");
            frontController.dispatchRequest("FACULTYMEMBER");

            System.out.println("Sending request for page: DOCTOR");
            frontController.dispatchRequest("DOCTOR");
        }
    }