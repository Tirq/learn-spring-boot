@RestController
class ThisWillActuallyRun{

  @RequestMapping("/")
  String home(){
    return "Hello World using Spring Boot and Groovy!"
    //to run this example, you need to have installed in your system the String CLI .
    //spring run app.groovy
  }

}