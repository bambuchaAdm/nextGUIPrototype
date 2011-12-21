package org.dndp.gui.player;

import org.apache.pivot.wtk.FlowPane;
import org.apache.pivot.wtk.Label;
import org.apache.pivot.wtk.TextInput;

public class AbilityView extends FlowPane
{
	Label		abilityName;
	TextInput	value;
	TextInput	modifier;

	public AbilityView()
	{
		System.out.println("Buduje atrybut");
		abilityName = new Label();
		abilityName.setPreferredWidth(80);
		add(abilityName);
		value = new TextInput();
		value.setPreferredWidth(30);
		add(value);
		modifier = new TextInput();
		modifier.setEnabled(false);
		modifier.setPreferredWidth(30);
		add(modifier);
		getStyles().put("alignToBaseline", true);
	}

	public String getAbilityName()
	{
		return abilityName.getText();
	}

	public void setAbilityName(String name)
	{
		this.abilityName.setText(name);
	}
}
