/******************************************************/
/****				Name - Kevin Harris			  *****/
/****				SID	 - C09515259			  *****/
/****	Summary - has a constructor with a thread *****/
/****			  to play a wav file when called  *****/
/******************************************************/
package com.assignment;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Song extends AllInformation {
	AudioInputStream audio;
	Clip clip;

	public void Song() {
		Thread ti = new Thread() {
			public void run() {
				try {
					audio = AudioSystem.getAudioInputStream(new File(
							"res/SoundEffect.wav"));
					clip = AudioSystem.getClip();

					clip.open(audio);

					clip.start();

				} catch (UnsupportedAudioFileException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		// Count.setText(g);
		ti.start();

	}

}
