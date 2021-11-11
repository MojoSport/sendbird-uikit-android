package com.sendbird.uikit.provider;

import androidx.core.content.FileProvider;

/**
 * This FileProvider was created to avoid conflicting with any FileProvider declared in the app that
 * uses this library.
 *
 * See: https://commonsware.com/blog/2017/06/27/fileprovider-libraries.html
 * See: https://stackoverflow.com/a/43444164/115145
 */
public class SendBirdFileProvider extends FileProvider {

}