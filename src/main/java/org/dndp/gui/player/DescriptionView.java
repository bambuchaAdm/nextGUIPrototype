package org.dndp.gui.player;

import java.net.URL;

import org.apache.pivot.beans.Bindable;
import org.apache.pivot.collections.Map;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.BoxPane;
import org.apache.pivot.wtk.Orientation;
import org.apache.pivot.wtk.Panel;

public class DescriptionView extends BoxPane implements Bindable
{
	public DescriptionView()
	{
		setOrientation(Orientation.VERTICAL);
		getStyles().put("fill", true);
		getStyles().put("padding", 4);
	}

	@Override
	public void initialize(Map<String, Object> namespace, URL location,
			Resources resources)
	{

	}

}
