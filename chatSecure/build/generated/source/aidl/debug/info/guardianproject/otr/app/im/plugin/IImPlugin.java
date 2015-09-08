/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\Moataz\\ChatSecureAndroid\\chatSecure\\src\\main\\aidl\\info\\guardianproject\\otr\\app\\im\\plugin\\IImPlugin.aidl
 */
package info.guardianproject.otr.app.im.plugin;
public interface IImPlugin extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements info.guardianproject.otr.app.im.plugin.IImPlugin
{
private static final java.lang.String DESCRIPTOR = "info.guardianproject.otr.app.im.plugin.IImPlugin";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an info.guardianproject.otr.app.im.plugin.IImPlugin interface,
 * generating a proxy if needed.
 */
public static info.guardianproject.otr.app.im.plugin.IImPlugin asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof info.guardianproject.otr.app.im.plugin.IImPlugin))) {
return ((info.guardianproject.otr.app.im.plugin.IImPlugin)iin);
}
return new info.guardianproject.otr.app.im.plugin.IImPlugin.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getResourceMap:
{
data.enforceInterface(DESCRIPTOR);
java.util.Map _result = this.getResourceMap();
reply.writeNoException();
reply.writeMap(_result);
return true;
}
case TRANSACTION_getSmileyIconIds:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getSmileyIconIds();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getProviderConfig:
{
data.enforceInterface(DESCRIPTOR);
java.util.Map _result = this.getProviderConfig();
reply.writeNoException();
reply.writeMap(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements info.guardianproject.otr.app.im.plugin.IImPlugin
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Gets a map of branding resources for the provider. The keys are defined
     * in {@link info.guardianproject.otr.app.im.plugin.BrandingResourceIDs}. The values are the
     * resource identifiers generated by the aapt tool.
     *
     * @return The map of branding resources.
     */
@Override public java.util.Map getResourceMap() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.Map _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getResourceMap, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readHashMap(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets an array of IDs of the smiley icons. The sequence of the IDs must
     * much the strings defined in {@link BrandingResourceIDs#STRING_ARRAY_SMILEY_TEXTS}.
     *
     * The IDs are generated by the aapt tool.
     *
     * @return An array of the IDs of the smiley icons.
     */
@Override public int[] getSmileyIconIds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSmileyIconIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Gets the configuration for the provider. The keys MUST match the values
     * defined in {@link ImConfigNames} and {@link ImpsConfigNames}
     *
     * @return the configuration for the provider.
     */
@Override public java.util.Map getProviderConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.Map _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProviderConfig, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readHashMap(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getResourceMap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getSmileyIconIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getProviderConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Gets a map of branding resources for the provider. The keys are defined
     * in {@link info.guardianproject.otr.app.im.plugin.BrandingResourceIDs}. The values are the
     * resource identifiers generated by the aapt tool.
     *
     * @return The map of branding resources.
     */
public java.util.Map getResourceMap() throws android.os.RemoteException;
/**
     * Gets an array of IDs of the smiley icons. The sequence of the IDs must
     * much the strings defined in {@link BrandingResourceIDs#STRING_ARRAY_SMILEY_TEXTS}.
     *
     * The IDs are generated by the aapt tool.
     *
     * @return An array of the IDs of the smiley icons.
     */
public int[] getSmileyIconIds() throws android.os.RemoteException;
/**
     * Gets the configuration for the provider. The keys MUST match the values
     * defined in {@link ImConfigNames} and {@link ImpsConfigNames}
     *
     * @return the configuration for the provider.
     */
public java.util.Map getProviderConfig() throws android.os.RemoteException;
}