# hashids

A Clojure wrapper library for [Hashids](http://www.hashids.org/java/).

[![Build Status](https://travis-ci.org/hashobject/hashids.png)](https://travis-ci.org/hashobject/hashids)
[![Dependencies Status](http://jarkeeper.com/hashobject/hashids/status.png)](http://jarkeeper.com/hashobject/hashids)


## Install

```
[hashobject/hashids "0.2.0"]
```

## Usage

```
user=> (use 'hashids.core)
nil
user=> (encrypt 134 "super-secret-salt")
"Lzn"
user=> (decrypt "Lzn" "super-secret-salt")
134
user=> (encrypt 225 "super-secret-salt")
"7jR"
```

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
