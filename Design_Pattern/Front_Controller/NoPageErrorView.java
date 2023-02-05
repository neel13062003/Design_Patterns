//NoPageErrorView (An error View class)
package designpattern.frontcontroller;
    public class NoPageErrorView extends DefaultView{
    @Override
    public void showView() {
        System.out.println("No such page exists");
    }
}