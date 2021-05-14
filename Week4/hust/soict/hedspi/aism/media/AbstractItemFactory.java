package hust.soict.hedspi.aism.media;

import hust.soict.hedspi.aims.PlayerException;

import java.util.ArrayList;

public interface AbstractItemFactory {
	public Media createMediaItemFromConsole() throws PlayerException;
}
