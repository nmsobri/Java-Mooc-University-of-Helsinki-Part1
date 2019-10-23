/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slier
 */
public class StringUtils {

	public static boolean included(String word, String searched) {
		searched = searched.trim().toLowerCase();
		word = word.trim().toLowerCase();
		return word.contains(searched);
	}
}
