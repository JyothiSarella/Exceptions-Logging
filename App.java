package Logging.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{ private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    { simpleandcompound cs = new simpleandcompound();
	LOGGER.warn("Simple and Compound Interest");
	LOGGER.info("Simple Interest is : " + cs.findSimpleInterest(1000,2,5));
	LOGGER.debug("Compound Interest yearly is : " + cs.findCompoundInterest(1500,2,5,true));
	LOGGER.error("Compound Interest half yearly is : " + cs.findCompoundInterest(1600,3,4,false));
    	HouseConstructionCost hs = new HouseConstructionCost();
    	LOGGER.fatal("House Construction Cost");
    	LOGGER.warn("The cost for the construction is:  Rs " + hs.estimateCost("standardMaterial", 300.0, false));
    	LOGGER.debug("The cost for the construction is:  Rs" + hs.estimateCost("aboveStandardMaterial", 100.0, false));
    	LOGGER.error("The cost for the construction is:   Rs" + hs.estimateCost("highStandardMaterial", 150.0, false));
    	LOGGER.info("The cost for the construction is:  Rs" + hs.estimateCost("highStandardMaterial", 200.0, true));
    }
}
