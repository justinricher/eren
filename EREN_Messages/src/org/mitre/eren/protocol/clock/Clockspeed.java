package org.mitre.eren.protocol.clock;

import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;

public interface Clockspeed extends ExtensibleElement, Element, ClockConstants {

	public Integer getRatio();
	public void setRatio(Integer val);
	
}
