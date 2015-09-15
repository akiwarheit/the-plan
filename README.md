# The Plan

###### Android library with basic adapters to get to up-to-speed in development.

Features
----

1. `ViewableListAdapter`
2. `ViewModel`

###### Installation

Sample ViewModel usage:

```
public class SampleViewModel extends ViewModel<Model> {
    ...

    public SampleViewModel (Model m) {
        super(m);
    }

    //override getView since ViewModel implements Viewable
    public View getView (
        ...
        return view;
    )
}
```

Declare ViewableListAdapter inside your activity/fragment like this:

```
public ViewableListAdapter<SampleViewModel> adapter;
```

Initialize ViewableListAdapter when activity is already created like this:
```
adapter = new ViewableListAdapter<>(<LIST OF MODELS>); or
adapter = new ViewableListAdapter<>(<CONTEXT>, <LIST OF MODELS>);
```

Now you have your ViewableListAdapter ready to be set to your list view.

## Notice
Copyright 2015 XLR8 Ventures Inc.

## License
Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

