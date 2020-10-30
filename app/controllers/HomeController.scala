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
      case "taiwo"   => Ok(views.html.taiwo(name.capitalize))
      case "varsha"  => Ok(views.html.varsha(name.capitalize))
      case "ellis"   => Ok(views.html.ellis(name.capitalize))
      case _          => Ok(views.html.index("Superheros"))
    }
  }
}
