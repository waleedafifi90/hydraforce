import actions.CategoryPageActions
import actions.GeneralActions
import actions.HeaderActions
import helpers.GeneralHelpers
import validations.CategoryPageValidations
import validations.GeneralValidations


GeneralHelpers.initScenario()

GeneralActions.clickOnAcceptCookies()

HeaderActions.hoverOverProducts()
HeaderActions.clickOnElectronicVehicleControl()
GeneralValidations.verifyCurrentPageURL('electronic-vehicle-controls')
GeneralValidations.verifyCurrentPageTitleValue('Electronic Vehicle Controls')
CategoryPageValidations.verfiyCurrentPageHeading('Electronic Vehicle Controls')
CategoryPageActions.selectRandomClassifications();