package Logging.epam;

import java.util.*;
public class HouseConstructionCost {

public double estimateCost(String material, double area, boolean fullyAutomated) {
	// TODO Auto-generated method stub
	if(material.equals("standardMaterial") && fullyAutomated == false)
	{
	return 1200*area;
	}
	else if(material.equals("aboveStandardMaterial") && fullyAutomated == false)
	{
	return 1500*area;
	}
	else if(material.equals("highStandardMaterial") && fullyAutomated == false)
	{
	return 1800*area;
	}
	else
	{
	return 2500*area;
	}
}
}