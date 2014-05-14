# Android SlidingTabStrip

[Forked from PagerSlidingTabStrip by Andreas Stütz](https://play.google.com/store/apps/details?id=com.astuetz.viewpager.extensions.sample).

This fork provides a View tu mimic a Tab widget.
The result is similar to Andreas's library.

![PagerSlidingTabStrip Sample Screenshot 1](https://lh3.ggpht.com/PXS7EmHhQZdT1Oa379iy91HX3ByWAQnFZAthMAFa_QHAOHNClEaXU5nxDEAj1F2eqbk)![PagerSlidingTabStrip Sample Screenshot 2](https://lh3.ggpht.com/oaksDoUcQlGB4j7VEkBCOjrvSzjtzVHHcKq8pAnGVfm6oxkcJg_w1QS4tyP3fLcqrwcX)

# Usage

*For a working implementation of this project see the `sample/` folder.*

  1. Include the library as local library project or add the dependency in your build.gradle.

        dependencies {
            // TODO
            compile ''
        }

  2. Include the SlidingTabStrip widget in your layout.

        <fr.jdn.SlidingTabStrip
            android:id="@+id/tabs"
            android:layout_width="match_parent"
            android:layout_height="48dip" />

  3. In your `onCreate` method (or `onViewCreated` for a fragment), set a OnTabClickListener.

         SlidingTabStrip tabs = (SlidingTabStrip) findViewById(R.id.tabs);
         tabs.setOnTabClickListener( new OnTabClickListener(){
            public void onTabClicked( int position )
            {
                // Do something
                Toast.makeText( context, "click " + position, Toast.LENGTH_SHORT).show();
            }
         });

  4. Populate the SlidingTabStrip.

         // continued from above
         tabs.addTextTab("test1");
         tabs.addTextTab("test2");
         tabs.addTextTab("test3");
         tabs.addTextTab("test4");
         tabs.addIconTab(android.R.drawable.ic_menu_add);
         tabs.addIconTab(android.R.drawable.ic_menu_call);
         tabs.addTextTab("test5");
         tabs.addTextTab("test6");
         
         tabs.clearTab();

# Customization

To not just look like another Play Store styled app, go and adjust these values to match
your brand:

 * `stsIndicatorColor` Color of the sliding indicator
 * `stsUnderlineColor` Color of the full-width line on the bottom of the view
 * `stsDividerColor` Color of the dividers between tabs
 * `stsIndicatorHeight`Height of the sliding indicator
 * `stsUnderlineHeight` Height of the full-width line on the bottom of the view
 * `stsDividerPadding` Top and bottom padding of the dividers
 * `stsTabPaddingLeftRight` Left and right padding of each tab
 * `stsScrollOffset` Scroll offset of the selected tab
 * `stsTabBackground` Background drawable of each tab, should be a StateListDrawable
 * `stsShouldExpand` If set to true, each tab is given the same weight, default false
 * `stsTextAllCaps` If true, all tab titles will be upper case, default true

*All attributes have their respective getters and setters to change them at runtime*

# Changelog

### Current Version: 1.0.2

### [1.0.2](https://github.com/juliendn/SlidingTabStrip/tree/v1.0.2)

 * Modify PagerSlidingTabStrip into SlidingTabStrip
 * Update sample to match new widget
 * Update for Graddle 0.9
 * change path to match standard android-studio src path
 * Fork from https://github.com/astuetz/PagerSlidingTabStrip
 
### [1.0.1](https://github.com/astuetz/PagerSlidingTabStrip/tree/v1.0.1)
 
  * Upgraded gradle build files
  * Changed package name to `com.astuetz.PagerSlidingTabStrip`
  * [#37](https://github.com/astuetz/PagerSlidingTabStrip/pull/37), [#41](https://github.com/astuetz/PagerSlidingTabStrip/pull/41) Added `psts` prefix to all attributes in `attrs.xml`
  * [#46](https://github.com/astuetz/PagerSlidingTabStrip/pull/46) Changed the shouldExpand behavior to set the layout at the time the tab is added


# Developed By

 * Julien De Nadai - <julien.denadai@gmail.com>
 * Andreas Stuetz - <andreas.stuetz@gmail.com>


### Credits

 * [Kirill Grouchnikov](https://plus.google.com/108761828584265913206/posts) - Author of [an explanation post on Google+](https://plus.google.com/108761828584265913206/posts/Cwk7joBV3AC)


# License
    
    Copyright 2014 Julien De Nadai
    ----------------------------------------------------------------------------
    "THE BEER-WARE LICENSE" (Revision 42):
    <phk@FreeBSD.ORG> wrote this file. As long as you retain this notice you
    can do whatever you want with this stuff. If we meet some day, and you think
    this stuff is worth it, you can buy me a beer in return Poul-Henning Kamp
    ----------------------------------------------------------------------------
   
![Beerware_logo](http://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/BeerWare_Logo.svg/220px-BeerWare_Logo.svg.png)

    Copyright 2013 Andreas Stuetz

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
