README
======

Transistor One - Simple Radio App
-----------------------------

**Version 3.2.x ("Life on Mars?")**

Transistor One is a bare bones app for listening to radio programs over the internet. The app stores stations as files on your device's external storage. It currently understands streams encoded in MP3, AAC and Ogg/Opus(*).

Important note: This is an app of type BYOS ("bring your own station"). It does not feature any kind of built-in search option. You will have to manually add radio stations.

Transistor One is free software. It is published under the [MIT open source license](https://opensource.org/licenses/MIT). Want to help? Please check out the notes in [CONTRIBUTE.md](https://github.com/y20k/transistorone/blob/master/CONTRIBUTE.md) first.

Transistor One, Transistor? How confusing!
------------------
Transistor One is the old Transistor app before version 4.x. The new [Transistor]((https://github.com/y20k/transistor/) only supports Android from version 7.1 on upwards. Transistor One on the other hand runs on Android devices from version 4.4 on. Transistor Ones is just a maintainance fork of the old Transtistor 3.2. Do not expect any new features.

How to use Transistor One
---------------------
### How to add a new radio station?
The easiest way to add a new station is to search for streaming links (m3u or pls) and then choose Transistor One as a your default handler for those file types. You can also tap the (+) symbol in the top bar and paste in streaming links directly. Please note: Transistor One does not feature any kind of built-in search option.

### How to play back a radio station?
Tap the Play button ;).

### How to stop playback?
Tap the Stop button within the app or on the notification - or just unplug your headphones.

### How to start the sleep timer?
Tapping the Clock symbol in the stations detail screen starts a 15 minute countdown after which Transistor One stops playback. An additional tap adds 15 minutes to the clock. Playback must be running to be able to activate the sleep timer.

### How to place a station shortcut on the Home screen?
The option to place a shortcut for a station on the Home screen can be accessed from the station's three dots menu. A tap on a shortcut will open Transistor One - playback will start immediately.

### How to rename or delete a station?
The rename and delete options can be accessed both from the station's detail screen. Just tap on the three dots symbol. You can manage the list of stations also from a file browser (see next question).

### Where does Transistor One store its stations?
Transistor One does not save its list of stations in a database. Instead it stores stations as M3U files on your device's external storage. Feel free to tinker with those files using the text editor of your choice. The files are stored in /Android/data/org.y20k.transistorone/files/Collection.

### How do I backup and transfer my radio stations?
Transistor One supports Android 6's [Auto Backup](http://developer.android.com/about/versions/marshmallow/android-6.0.html#backup) feature. Radio stations are always backed up to your Google account and will be restored at reinstall. On devices running on older versions of Android you must manually save and restore the "Collection" folder.

### Why does Transistor One not have any setting?
There is nothing to be set ;). Transistor One is a very simple app. Depending on your point of view "simple" is either great or lame.

Which Permissions does Transistor One need?
---------------------------------------
### Permission "INSTALL_SHORTCUT" and "UNINSTALL_SHORTCUT"
This permission is needed to install and uninstall radio station shortcuts on the Android Home screen.

### Permission "INTERNET"
Transistor One streams radio stations over the internet.

### Permission "READ_EXTERNAL_STORAGE"
Transistor One needs access to images, photos and documents to be able to customize radio station icons and to able to open locally saved playlist files.

### Permission "VIBRATE"
Tapping and holding a radio station will toggle a tiny vibration.

### Permission "WAKE_LOCK"
During Playback Transistor One acquires a so called partial wake lock. That prevents the Android system to stop playback for power saving reasons.

(*) Opus playback is only supported on devices running Android 5.0+