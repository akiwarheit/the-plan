# The Plan

###### Android library with basic adapters to get to up-to-speed in displaying lists

Features
----

1. `ViewableListAdapter`
2. `ViewModel`

Installation
----

Add the ff. maven repository and library to your project via gradle

```
repositories {
    maven { url 'https://dl.bintray.com/indiehortelano/maven/' }
}

// bunch of stuff

dependencies {
    compile 'com.keeboi.theplan:theplan:0.0.1-BETA@aar'
}
```

Usage
----

*(NOTE: Please read about convert view before proceeding)*

Given that I have an object as follows:

```java
public class User {
    
    private String name;
    
    private String occupation;

    public String getName();
    
    public String getOccupation();
    
    // setters ...

}
```

I can simply wrap it around a `ViewModel` class and implement it's methods 

```java
public class UserViewModel extends ViewModel<User> {

    public UserViewModel (User model) {
        super(model); // lol
    }

    //override getView since ViewModel implements Viewable
    public View getView(int position, LayoutInflater inflater, View convertView, ViewGroup parent) {
        View view = null // The view of each row
        
        // We check the convertView if it's null, this is basically a view already inflated and is just being recycled
        if(convertView == null) {
            view = inflater.inflate(R.layout.layout_user_row, null, false);
        } else {
            view = convertView;
        }
    
        ((TextView) view.findViewById(R.id.name)).setText(getObject.getName());
        ((TextView) view.findViewById(R.id.occupation)).setText(getObject.getOccupation());
    
        return view;
    }
}
```

Initialize `ViewableListAdapter` (`this` refers to an `Activity`)

```java
adapter = new ViewableListAdapter<>(this); # models
adapter = new ViewableListAdapter<>(this, new ArrayList<UserViewModel>());
```

Now you have your `ViewableListAdapter` ready to be set to your list view.

```java
listView.setAdapter(adapter);
```

When you've updated your list of view models (adding, removing, editting, whatever), simply call

```java
adapter.notifyDataSetChanged();
```

## Notice
Copyright 2015 XLR8 Ventures Inc.

## License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
