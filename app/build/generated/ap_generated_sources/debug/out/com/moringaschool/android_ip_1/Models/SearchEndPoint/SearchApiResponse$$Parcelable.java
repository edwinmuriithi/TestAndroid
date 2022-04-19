
package com.moringaschool.android_ip_1.Models.SearchEndPoint;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class SearchApiResponse$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse>
{

    private com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse searchApiResponse$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SearchApiResponse$$Parcelable>CREATOR = new Creator<SearchApiResponse$$Parcelable>() {


        @Override
        public SearchApiResponse$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SearchApiResponse$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SearchApiResponse$$Parcelable[] newArray(int size) {
            return new SearchApiResponse$$Parcelable[size] ;
        }

    }
    ;

    public SearchApiResponse$$Parcelable(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse searchApiResponse$$2) {
        searchApiResponse$$0 = searchApiResponse$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(searchApiResponse$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse searchApiResponse$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(searchApiResponse$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(searchApiResponse$$1));
            parcel$$1 .writeString(InjectionUtil.getField(String.class, com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "pushId"));
            if (InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "companies") == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "companies").size());
                for (com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$0 : InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "companies")) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.write(searchArrayObject$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
            if (InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "names") == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "names").size());
                for (com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$1 : InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "names")) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.write(searchArrayObject$$1, parcel$$1, flags$$0, identityMap$$0);
                }
            }
            if (InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "titles") == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "titles").size());
                for (com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$2 : InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>>(), com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$1, "titles")) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.write(searchArrayObject$$2, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse getParcel() {
        return searchApiResponse$$0;
    }

    public static com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse searchApiResponse$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            searchApiResponse$$4 = new com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse();
            identityMap$$1 .put(reservation$$0, searchApiResponse$$4);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$4, "pushId", parcel$$3 .readString());
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$3 = com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$0 .add(searchArrayObject$$3);
                }
            }
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$4, "companies", list$$0);
            int int$$2 = parcel$$3 .readInt();
            java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject> list$$1;
            if (int$$2 < 0) {
                list$$1 = null;
            } else {
                list$$1 = new java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>(int$$2);
                for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$4 = com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$1 .add(searchArrayObject$$4);
                }
            }
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$4, "names", list$$1);
            int int$$4 = parcel$$3 .readInt();
            java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject> list$$2;
            if (int$$4 < 0) {
                list$$2 = null;
            } else {
                list$$2 = new java.util.ArrayList<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>(int$$4);
                for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                    com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$5 = com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$2 .add(searchArrayObject$$5);
                }
            }
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse.class, searchApiResponse$$4, "titles", list$$2);
            com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchApiResponse searchApiResponse$$3 = searchApiResponse$$4;
            identityMap$$1 .put(identity$$1, searchApiResponse$$3);
            return searchApiResponse$$3;
        }
    }

}
