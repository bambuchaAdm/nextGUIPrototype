package org.dndp.gui.player;

import java.lang.reflect.Modifier;
import java.net.URL;

import org.apache.pivot.beans.BXML;
import org.apache.pivot.beans.Bindable;
import org.apache.pivot.collections.Map;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.BoxPane;
import org.apache.pivot.wtk.FlowPane;
import org.apache.pivot.wtk.Label;
import org.apache.pivot.wtk.Panel;
import org.apache.pivot.wtk.TextInput;

public class AbilitieView extends FlowPane
{
	Label		name;
	TextInput	value;
	TextInput	modifier;

	public AbilitieView()
	{
		System.out.println("Buduje atrybut");
		name = new Label();
		name.setPreferredWidth(80);
		add(name);
		value = new TextInput();
		value.setPreferredWidth(30);
		add(value);
		modifier = new TextInput();
		modifier.setEnabled(false);
		modifier.setPreferredWidth(30);
		add(modifier);
		getStyles().put("alignToBaseline", true);
	}

	public void setName(String name)
	{
		this.name.setText(name);
	}

	public String getName()
	{
		return name.getText();
	}
}
