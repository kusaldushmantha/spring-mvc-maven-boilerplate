package springmvctutorial;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created By: Kusal Kankanamge
 * Created On: 04-Apr-2020
 */
@Controller
@RequestMapping( "/customer" )
public class CustomerController
{
    @RequestMapping( "/showForm" )
    public String showForm( Model theModel )
    {
        theModel.addAttribute( "customer", new Customer() );
        return "customer-form";
    }

    @RequestMapping( "/processForm" )
    public String processForm(
            @Valid @ModelAttribute( "customer" ) Customer theCustomer,
            BindingResult theBindingResult, Model model )
    {
        if( theBindingResult.hasErrors() )
        {
            // clear the invalid input field
            BeanPropertyBindingResult result2 = new BeanPropertyBindingResult( theCustomer, theBindingResult.getObjectName() );
            for( ObjectError error : theBindingResult.getGlobalErrors() )
            {
                result2.addError( error );
            }
            for( FieldError error : theBindingResult.getFieldErrors() )
            {
                result2.addError( new FieldError( error.getObjectName(), error.getField(), null, error.isBindingFailure(), error.getCodes(), error.getArguments(), error.getDefaultMessage() ) );
            }
            model.addAllAttributes( result2.getModel() );
            return "customer-form";
        }
        else
        {
            return "customer-confirmation";
        }
    }

    @InitBinder
    public void initBinder( WebDataBinder dataBinder )
    {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor( true );
        dataBinder.registerCustomEditor( String.class, stringTrimmerEditor );
    }
}
