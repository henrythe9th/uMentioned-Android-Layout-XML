uMentioned-Android-Layout-XML
=============================

Android XML Layouts

The XML files are in res/layout folder

Setting saves values in mSettingArray in SettingsFragment.java:

indexes in mSettingArray will be set to "checked" if the box is checked and they are in this order:
        mSettingArray[0] = spottedKey;
        mSettingArray[1] = confessionKey;
        mSettingArray[2] = overheardKey;
        
        if it is not checked the values in the array will be set to "empty"
        
        
        
      The frequency value is saved in mSelected in Settings.java file:
        0 = Always
        1 = Hourly
        3 = Occasionally
        24 = Daily



