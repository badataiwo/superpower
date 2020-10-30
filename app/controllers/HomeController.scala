package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.i18n._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController with I18nSupport {

  //Setup an application logger
  val appLogger: Logger = Logger("application")
  
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Superheros"))
  }
  
  
  def loadPage(name: String) = Action { implicit request: Request[AnyContent] =>
    appLogger.debug(s"Loading page: $name")
    
    name match {
      case "lincoln"  => Ok(views.html.lincoln(name.capitalize))
<<<<<<< HEAD
      case "catherine"  => Ok(views.html.catherine(name.capitalize))
=======
      case "taiwo"   => Ok(views.html.taiwo(name.capitalize))
      case "varsha"  => Ok(views.html.varsha(name.capitalize))
<<<<<<< HEAD
>>>>>>> 132f5434971ff0cc3911d69ad2c8182da4a50b6c
=======
      case "ellis"   => Ok(views.html.ellis(name.capitalize))
      case "lares"   => Ok(views.html.lares(name.capitalize))
       case "ian"   => Ok(views.html.ian(name.capitalize))
>>>>>>> d3e0f1e33cbdf6f8c801892b8f9fcb7e960cb105
      case _          => Ok(views.html.index("Superheros"))
    }
  }
}
