## Release Notes

This is an Android porting of 3.1.0-SNAPSHOT Java MongoDB Driver.

I've forked from ufficial mongodb/mongo-java-driver and integrated classes from
https://github.com/koterpillar/android-sasl
to fix javax.security.sasl on Android.

## Important
No driver-async is not ported because java.nio.channels.AsynchronousSocketChannel doesn't exist on Android and doesn't exist any porting.
