package org.dndp.gui.player;

import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;

public class Starter implements Application
{
	private Window	window;

	public void startup(Display display, Map<String, String> properties)
			throws Exception
	{
		BXMLSerializer serializer = new BXMLSerializer();
		window = (Window)serializer.readObject(MainView.class, "mainView.xml");
		window.open(display);
	}

	public boolean shutdown(boolean optional) throws Exception
	{
		if(window == null)
			window.close();
		return false;
	}

	public void suspend() throws Exception
	{

	}

	public void resume() throws Exception
	{

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		DesktopApplicationContext.main(Starter.class, args);
	}

}
