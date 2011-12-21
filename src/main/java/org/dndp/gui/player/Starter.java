package org.dndp.gui.player;

import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;

public class Starter implements Application
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		DesktopApplicationContext.main(Starter.class, args);
	}

	private Window	window;

	@Override
	public void resume() throws Exception
	{

	}

	@Override
	public boolean shutdown(boolean optional) throws Exception
	{
		if(window != null)
			window.close();
		return false;
	}

	@Override
	public void startup(Display display, Map<String, String> properties)
			throws Exception
	{
		BXMLSerializer serializer = new BXMLSerializer();
		window = (Window)serializer.readObject(MainView.class, "mainView.bxml");
		window.open(display);
	}

	@Override
	public void suspend() throws Exception
	{

	}

}
