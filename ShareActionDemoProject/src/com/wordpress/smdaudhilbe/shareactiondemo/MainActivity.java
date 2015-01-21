package com.wordpress.smdaudhilbe.shareactiondemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.wordpress.smdaudhilbe.shareactiondemoproject.R;

/*
 * 	good resources @ http://stackoverflow.com/questions/17167701/how-to-activate-share-button-in-android-app
 *	https://clickclickclack.wordpress.com/2012/01/03/intercepting-androids-action_send-intents/#
 *	really worked for me : http://sudarmuthu.com/blog/sharing-content-in-android-using-action_send-intent/
 *	http://code.tutsplus.com/tutorials/android-sdk-implement-a-share-intent--mobile-8433
 *	http://stackoverflow.com/questions/1698050/multiple-mime-types-in-android
 * 
 * */

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.my_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case R.id.shareButton:
//			for text sharing
//			Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//			sharingIntent.setType("text/html");
//			sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>This is the text that will be shared.</p>"));
//			startActivity(Intent.createChooser(sharingIntent,"Share using"));
			
//			image / video sharing
//			Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//			Uri screenshotUri = Uri.parse("/storage/emulated/0/DCIM/Camera/Du.jpg");
//			 
//			sharingIntent.setType("image/png");
//			sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
//			startActivity(Intent.createChooser(sharingIntent, "Share image using"));
			
//			for video
			Intent sharingIntent = new Intent(Intent.ACTION_SEND);
			Uri screenshotUri = Uri.parse("/storage/extSdCard/Movies/PK/Pk.mkv");
			 
			sharingIntent.setType("video/*");
			sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
			startActivity(Intent.createChooser(sharingIntent, "Share image using"));

			break;
		}
		return true;
	}
}