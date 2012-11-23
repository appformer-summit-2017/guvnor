package org.drools.guvnor.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class ModuleService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.allen_sauer.gwt.dnd.client.DragHandlerCollection/3996089253"] = [
        @com.allen_sauer.gwt.dnd.client.DragHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.allen_sauer.gwt.dnd.client.DragHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/allen_sauer/gwt/dnd/client/DragHandlerCollection;),
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializableException;),
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializationException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/287642957"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/2152455986"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FocusListenerCollection/119490835"] = [
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FocusListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FormHandlerCollection/3088681894"] = [
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FormHandlerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242"] = [
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.LoadListenerCollection/3174178888"] = [
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/LoadListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseListenerCollection/465158911"] = [
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552"] = [
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ];
    
    result["[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420"] = [
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MultiWordSuggestOracle_MultiWordSuggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/MultiWordSuggestOracle$MultiWordSuggestion;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/1920131050"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/210686268"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Request_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Request;),
      ];
    
    result["com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Response_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/SuggestOracle$Response;),
      ];
    
    result["[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884"] = [
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.SuggestOracle_Suggestion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/user/client/ui/SuggestOracle$Suggestion;),
      ];
    
    result["com.google.gwt.user.client.ui.TabListenerCollection/3768293299"] = [
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TabListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TableListenerCollection/2254740473"] = [
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TableListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TreeListenerCollection/3716243734"] = [
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TreeListenerCollection;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Byte/1571082439"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
      ];
    
    result["java.lang.Float/1718559123"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.Short/551743396"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["[[Ljava.lang.String;/4182515373"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Ljava/lang/String;),
      ];
    
    result["java.math.BigDecimal/8151472"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigDecimal_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigDecimal;),
      ];
    
    result["java.math.BigInteger/927293797"] = [
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.math.BigInteger_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/math/BigInteger;),
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["[Ljava.util.AbstractList;/727920111"] = [
        @com.google.gwt.user.client.rpc.core.java.util.AbstractList_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.AbstractList_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/AbstractList;),
      ];
    
    result["[Ljava.util.AbstractSequentialList;/3144020509"] = [
        @com.google.gwt.user.client.rpc.core.java.util.AbstractSequentialList_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.AbstractSequentialList_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/AbstractSequentialList;),
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["[Ljava.util.ArrayList;/2683379088"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/ArrayList;),
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["[Ljava.util.LinkedList;/1037437294"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/LinkedList;),
      ];
    
    result["[Ljava.util.List;/2827171268"] = [
        @com.google.gwt.user.client.rpc.core.java.util.List_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.List_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/List;),
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["[Ljava.util.Stack;/675459124"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/Stack;),
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["[Ljava.util.Vector;/3889776585"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/Vector;),
      ];
    
    result["org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection/2634479852"] = [
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/cobogw/gwt/user/client/rpc/AsyncCallbackCollection;),
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/cobogw/gwt/user/client/rpc/AsyncCallbackCollection;)
      ];
    
    result["[Lorg.cobogw.gwt.user.client.rpc.AsyncCallbackCollection;/2203013177"] = [
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/cobogw/gwt/user/client/rpc/AsyncCallbackCollection;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.PropertiesHolder/3220464228"] = [
        @org.drools.guvnor.client.asseteditor.PropertiesHolder_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.PropertiesHolder_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/PropertiesHolder;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.PropertyHolder/138851633"] = [
        @org.drools.guvnor.client.asseteditor.PropertyHolder_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.PropertyHolder_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/PropertyHolder;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.PropertyHolder;/3463468498"] = [
        @org.drools.guvnor.client.asseteditor.PropertyHolder_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.PropertyHolder_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/PropertyHolder;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel/3651081605"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/factmodel/AnnotationMetaModel;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel;/2643586691"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/drools/factmodel/AnnotationMetaModel;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel/717485726"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/factmodel/FactMetaModel;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel;/2250982735"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/drools/factmodel/FactMetaModel;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.factmodel.FactModels/129987162"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactModels_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FactModels_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/factmodel/FactModels;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel/2435745324"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/factmodel/FieldMetaModel;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel;/702608451"] = [
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/drools/factmodel/FieldMetaModel;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter/3755041370"] = [
        @org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/modeldriven/SetFactTypeFilter;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssertBehaviorOption/3303424521"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssertBehaviorOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssertBehaviorOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/AssertBehaviorOption;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssetReference/3504811494"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssetReference_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssetReference_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/AssetReference;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ClockType/3149665656"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ClockType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ClockType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ClockType;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.EventProcessingOption/3262079858"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.EventProcessingOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.EventProcessingOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/EventProcessingOption;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ListenerType/91118168"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ListenerType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ListenerType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ListenerType;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.MarshallingOption/591863003"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.MarshallingOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.MarshallingOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/MarshallingOption;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ProtocolOption/1697776378"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ProtocolOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ProtocolOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ProtocolOption;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceConfig/1718986263"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ServiceConfig;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKAgentConfig/3276528542"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKAgentConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKAgentConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ServiceKAgentConfig;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKBaseConfig/3886992660"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKBaseConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKBaseConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ServiceKBaseConfig;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKSessionConfig/2307904333"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKSessionConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKSessionConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/ServiceKSessionConfig;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.serviceconfig.SessionType/3243758077"] = [
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.SessionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.serviceconfig.SessionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/serviceconfig/SessionType;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode/1424972328"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/ElementContainerTransferNode;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode;/3809754860"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/ElementContainerTransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode/3726411311"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/HumanTaskTransferNode;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode;/446345653"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/HumanTaskTransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.SplitNode$ConnectionRef/3576963957"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitNode_ConnectionRef_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitNode_ConnectionRef_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/SplitNode$ConnectionRef;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.SplitNode$Constraint/4028603467"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitNode_Constraint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitNode_Constraint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/SplitNode$Constraint;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode/3651508595"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/SplitTransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode$Type/4244380074"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_Type_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_Type_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/SplitTransferNode$Type;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode;/2285811217"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/SplitTransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection/3080672814"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/TransferConnection;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.TransferConnection;/2621459290"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/TransferConnection;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.TransferNode/469691896"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/TransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.TransferNode$Type/2240396873"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_Type_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_Type_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/TransferNode$Type;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.TransferNode;/4024066103"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.TransferNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/TransferNode;),
      ];
    
    result["org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode/73365898"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/ruleflow/WorkItemTransferNode;),
      ];
    
    result["[Lorg.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode;/545310491"] = [
        @org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/asseteditor/ruleflow/WorkItemTransferNode;),
      ];
    
    result["org.drools.guvnor.client.common.RdbmsConfigurable/1439703124"] = [
        @org.drools.guvnor.client.common.RdbmsConfigurable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.common.RdbmsConfigurable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/common/RdbmsConfigurable;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AbstractAssetPageRow;/2168433150"] = [
        @org.drools.guvnor.client.rpc.AbstractAssetPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AbstractAssetPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AbstractAssetPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AbstractPageRow;/4168434293"] = [
        @org.drools.guvnor.client.rpc.AbstractPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AbstractPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AbstractPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.AdminArchivedPageRow/4200366411"] = [
        @org.drools.guvnor.client.rpc.AdminArchivedPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AdminArchivedPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AdminArchivedPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AdminArchivedPageRow;/3296282530"] = [
        @org.drools.guvnor.client.rpc.AdminArchivedPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AdminArchivedPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AdminArchivedPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.AnalysisFactUsage/2366837231"] = [
        @org.drools.guvnor.client.rpc.AnalysisFactUsage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisFactUsage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AnalysisFactUsage;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AnalysisFactUsage;/2448927722"] = [
        @org.drools.guvnor.client.rpc.AnalysisFactUsage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisFactUsage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AnalysisFactUsage;),
      ];
    
    result["org.drools.guvnor.client.rpc.AnalysisFieldUsage/4238632060"] = [
        @org.drools.guvnor.client.rpc.AnalysisFieldUsage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisFieldUsage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AnalysisFieldUsage;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AnalysisFieldUsage;/2756149784"] = [
        @org.drools.guvnor.client.rpc.AnalysisFieldUsage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisFieldUsage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AnalysisFieldUsage;),
      ];
    
    result["org.drools.guvnor.client.rpc.AnalysisReport/2987744465"] = [
        @org.drools.guvnor.client.rpc.AnalysisReport_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisReport_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AnalysisReport;),
      ];
    
    result["org.drools.guvnor.client.rpc.AnalysisReportLine/2253191678"] = [
        @org.drools.guvnor.client.rpc.AnalysisReportLine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisReportLine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AnalysisReportLine;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AnalysisReportLine;/2393762904"] = [
        @org.drools.guvnor.client.rpc.AnalysisReportLine_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AnalysisReportLine_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AnalysisReportLine;),
      ];
    
    result["org.drools.guvnor.client.rpc.Artifact/2312170343"] = [
        @org.drools.guvnor.client.rpc.Artifact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Artifact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/Artifact;),
        @org.drools.guvnor.client.rpc.Artifact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/Artifact;)
      ];
    
    result["org.drools.guvnor.client.rpc.Asset/2594588063"] = [
        @org.drools.guvnor.client.rpc.Asset_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Asset_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/Asset;),
      ];
    
    result["org.drools.guvnor.client.rpc.AssetPageRequest/4043140489"] = [
        @org.drools.guvnor.client.rpc.AssetPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AssetPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AssetPageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.AssetPageRow/2218996587"] = [
        @org.drools.guvnor.client.rpc.AssetPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AssetPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/AssetPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.AssetPageRow;/667490531"] = [
        @org.drools.guvnor.client.rpc.AssetPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.AssetPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/AssetPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.BuilderResult/1387203461"] = [
        @org.drools.guvnor.client.rpc.BuilderResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BuilderResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/BuilderResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.BuilderResultLine/2861242005"] = [
        @org.drools.guvnor.client.rpc.BuilderResultLine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BuilderResultLine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/BuilderResultLine;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.BuilderResultLine;/2572161422"] = [
        @org.drools.guvnor.client.rpc.BuilderResultLine_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BuilderResultLine_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/BuilderResultLine;),
      ];
    
    result["org.drools.guvnor.client.rpc.BulkTestRunResult/2982311969"] = [
        @org.drools.guvnor.client.rpc.BulkTestRunResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BulkTestRunResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/BulkTestRunResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.CategoryPageRequest/1553084883"] = [
        @org.drools.guvnor.client.rpc.CategoryPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.CategoryPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/CategoryPageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.CategoryPageRow/2703166588"] = [
        @org.drools.guvnor.client.rpc.CategoryPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.CategoryPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/CategoryPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.CategoryPageRow;/68289104"] = [
        @org.drools.guvnor.client.rpc.CategoryPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.CategoryPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/CategoryPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.Cause/403456510"] = [
        @org.drools.guvnor.client.rpc.Cause_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Cause_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/Cause;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.Cause;/936858851"] = [
        @org.drools.guvnor.client.rpc.Cause_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Cause_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/Cause;),
      ];
    
    result["org.drools.guvnor.client.rpc.ConversionResult/1748942422"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ConversionResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.ConversionResult$ConversionAsset/49399373"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionAsset_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionAsset_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ConversionResult$ConversionAsset;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.ConversionResult$ConversionAsset;/1722130527"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionAsset_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionAsset_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/ConversionResult$ConversionAsset;),
      ];
    
    result["org.drools.guvnor.client.rpc.ConversionResult$ConversionMessage/1585621227"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ConversionResult$ConversionMessage;),
      ];
    
    result["org.drools.guvnor.client.rpc.ConversionResult$ConversionMessageType/151430246"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessageType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessageType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ConversionResult$ConversionMessageType;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.ConversionResult$ConversionMessage;/2545938738"] = [
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResult_ConversionMessage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/ConversionResult$ConversionMessage;),
      ];
    
    result["org.drools.guvnor.client.rpc.ConversionResultNoConverter/2661705921"] = [
        @org.drools.guvnor.client.rpc.ConversionResultNoConverter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ConversionResultNoConverter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ConversionResultNoConverter;),
      ];
    
    result["org.drools.guvnor.client.rpc.DependenciesPageRow/3021521934"] = [
        @org.drools.guvnor.client.rpc.DependenciesPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.DependenciesPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/DependenciesPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.DependenciesPageRow;/3375478817"] = [
        @org.drools.guvnor.client.rpc.DependenciesPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.DependenciesPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/DependenciesPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.DetailedSerializationException/4010081135"] = [
        @org.drools.guvnor.client.rpc.DetailedSerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.DetailedSerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/DetailedSerializationException;),
      ];
    
    result["org.drools.guvnor.client.rpc.DiscussionRecord/1866698412"] = [
        @org.drools.guvnor.client.rpc.DiscussionRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.DiscussionRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/DiscussionRecord;),
      ];
    
    result["org.drools.guvnor.client.rpc.FormContentModel/2502097592"] = [
        @org.drools.guvnor.client.rpc.FormContentModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.FormContentModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/FormContentModel;),
      ];
    
    result["org.drools.guvnor.client.rpc.InboxIncomingPageRow/1678049514"] = [
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/InboxIncomingPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.InboxIncomingPageRow;/2215392433"] = [
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/InboxIncomingPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.InboxPageRequest/2902001826"] = [
        @org.drools.guvnor.client.rpc.InboxPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/InboxPageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.InboxPageRow/2762426230"] = [
        @org.drools.guvnor.client.rpc.InboxPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/InboxPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.InboxPageRow;/2644115897"] = [
        @org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/InboxPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.LogEntry/752151946"] = [
        @org.drools.guvnor.client.rpc.LogEntry_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogEntry_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/LogEntry;),
      ];
    
    result["org.drools.guvnor.client.rpc.LogPageRow/1286904464"] = [
        @org.drools.guvnor.client.rpc.LogPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/LogPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.LogPageRow;/3205332377"] = [
        @org.drools.guvnor.client.rpc.LogPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/LogPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.MavenArtifact/1138584451"] = [
        @org.drools.guvnor.client.rpc.MavenArtifact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.MavenArtifact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/MavenArtifact;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.MavenArtifact;/3390988313"] = [
        @org.drools.guvnor.client.rpc.MavenArtifact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.MavenArtifact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/MavenArtifact;),
      ];
    
    result["org.drools.guvnor.client.rpc.MetaData/2769241471"] = [
        @org.drools.guvnor.client.rpc.MetaData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.MetaData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/MetaData;),
      ];
    
    result["org.drools.guvnor.client.rpc.MetaDataQuery/3433133509"] = [
        @org.drools.guvnor.client.rpc.MetaDataQuery_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.MetaDataQuery_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/MetaDataQuery;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.MetaDataQuery;/2168760287"] = [
        @org.drools.guvnor.client.rpc.MetaDataQuery_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.MetaDataQuery_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/MetaDataQuery;),
      ];
    
    result["org.drools.guvnor.client.rpc.Module/3987908514"] = [
        @org.drools.guvnor.client.rpc.Module_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Module_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/Module;),
        @org.drools.guvnor.client.rpc.Module_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/Module;)
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.Module;/1835845701"] = [
        @org.drools.guvnor.client.rpc.Module_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.Module_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/Module;),
        @org.drools.guvnor.client.rpc.Module_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/guvnor/client/rpc/Module;)
      ];
    
    result["org.drools.guvnor.client.rpc.NewAssetConfiguration/2985301202"] = [
        @org.drools.guvnor.client.rpc.NewAssetConfiguration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.NewAssetConfiguration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/NewAssetConfiguration;),
      ];
    
    result["org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration/4274860629"] = [
        @org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/NewGuidedDecisionTableAssetConfiguration;),
      ];
    
    result["org.drools.guvnor.client.rpc.PageRequest/2522979705"] = [
        @org.drools.guvnor.client.rpc.PageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PageRequest;),
        @org.drools.guvnor.client.rpc.PageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/PageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.PageResponse/1139529059"] = [
        @org.drools.guvnor.client.rpc.PageResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PageResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PageResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.PermissionsPageRow/1300018583"] = [
        @org.drools.guvnor.client.rpc.PermissionsPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PermissionsPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PermissionsPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.PermissionsPageRow;/3744666246"] = [
        @org.drools.guvnor.client.rpc.PermissionsPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PermissionsPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/PermissionsPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.PushResponse/3692768440"] = [
        @org.drools.guvnor.client.rpc.PushResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PushResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PushResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.QueryMetadataPageRequest/1696980185"] = [
        @org.drools.guvnor.client.rpc.QueryMetadataPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryMetadataPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/QueryMetadataPageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.QueryPageRequest/2463488132"] = [
        @org.drools.guvnor.client.rpc.QueryPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/QueryPageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.QueryPageRow/1680853655"] = [
        @org.drools.guvnor.client.rpc.QueryPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/QueryPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.QueryPageRow;/3556272876"] = [
        @org.drools.guvnor.client.rpc.QueryPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/QueryPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.RuleContentText/3326806597"] = [
        @org.drools.guvnor.client.rpc.RuleContentText_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.RuleContentText_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/RuleContentText;),
      ];
    
    result["org.drools.guvnor.client.rpc.RuleFlowContentModel/427407354"] = [
        @org.drools.guvnor.client.rpc.RuleFlowContentModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.RuleFlowContentModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/RuleFlowContentModel;),
      ];
    
    result["org.drools.guvnor.client.rpc.ScenarioResultSummary/2334378227"] = [
        @org.drools.guvnor.client.rpc.ScenarioResultSummary_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ScenarioResultSummary_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ScenarioResultSummary;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.ScenarioResultSummary;/3871459632"] = [
        @org.drools.guvnor.client.rpc.ScenarioResultSummary_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ScenarioResultSummary_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/ScenarioResultSummary;),
      ];
    
    result["org.drools.guvnor.client.rpc.ScenarioRunResult/922476082"] = [
        @org.drools.guvnor.client.rpc.ScenarioRunResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ScenarioRunResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ScenarioRunResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.SessionExpiredException/3663857784"] = [
        @org.drools.guvnor.client.rpc.SessionExpiredException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SessionExpiredException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SessionExpiredException;),
      ];
    
    result["org.drools.guvnor.client.rpc.SingleScenarioResult/1659547457"] = [
        @org.drools.guvnor.client.rpc.SingleScenarioResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SingleScenarioResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SingleScenarioResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest/4008526572"] = [
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageRequest;),
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse/1041574609"] = [
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotComparisonPageRow/2222855516"] = [
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.SnapshotComparisonPageRow;/22188732"] = [
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotDiff/4059157476"] = [
        @org.drools.guvnor.client.rpc.SnapshotDiff_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotDiff_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotDiff;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.SnapshotDiff;/749597884"] = [
        @org.drools.guvnor.client.rpc.SnapshotDiff_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotDiff_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/SnapshotDiff;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotDiffs/1138021021"] = [
        @org.drools.guvnor.client.rpc.SnapshotDiffs_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotDiffs_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotDiffs;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotInfo/3941689836"] = [
        @org.drools.guvnor.client.rpc.SnapshotInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SnapshotInfo;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.SnapshotInfo;/820892288"] = [
        @org.drools.guvnor.client.rpc.SnapshotInfo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SnapshotInfo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/SnapshotInfo;),
      ];
    
    result["org.drools.guvnor.client.rpc.StatePageRequest/1905711895"] = [
        @org.drools.guvnor.client.rpc.StatePageRequest_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.StatePageRequest_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/StatePageRequest;),
      ];
    
    result["org.drools.guvnor.client.rpc.StatePageRow/443879953"] = [
        @org.drools.guvnor.client.rpc.StatePageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.StatePageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/StatePageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.StatePageRow;/3324871288"] = [
        @org.drools.guvnor.client.rpc.StatePageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.StatePageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/StatePageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableConfig/4030672863"] = [
        @org.drools.guvnor.client.rpc.TableConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableConfig;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableDataResult/2516166606"] = [
        @org.drools.guvnor.client.rpc.TableDataResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableDataResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableDataRow/4008720411"] = [
        @org.drools.guvnor.client.rpc.TableDataRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableDataRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.TableDataRow;/2256388940"] = [
        @org.drools.guvnor.client.rpc.TableDataRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/TableDataRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.UserSecurityContext/1012666777"] = [
        @org.drools.guvnor.client.rpc.UserSecurityContext_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.UserSecurityContext_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/UserSecurityContext;),
      ];
    
    result["org.drools.guvnor.client.rpc.ValidatedResponse/1450137662"] = [
        @org.drools.guvnor.client.rpc.ValidatedResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.ValidatedResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/ValidatedResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.WorkingSetConfigData/35990901"] = [
        @org.drools.guvnor.client.rpc.WorkingSetConfigData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.WorkingSetConfigData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/WorkingSetConfigData;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.WorkingSetConfigData;/3474841627"] = [
        @org.drools.guvnor.client.rpc.WorkingSetConfigData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.WorkingSetConfigData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/WorkingSetConfigData;),
      ];
    
    result["org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern/3703630433"] = [
        @org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/widgets/drools/wizards/assets/decisiontable/ActionInsertFactFieldsPattern;),
      ];
    
    result["[Lorg.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern;/672007427"] = [
        @org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/widgets/drools/wizards/assets/decisiontable/ActionInsertFactFieldsPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.factconstraints.ConstraintConfiguration;/1130577655"] = [
        @org.drools.ide.common.client.factconstraints.ConstraintConfiguration_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.ConstraintConfiguration_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/factconstraints/ConstraintConfiguration;),
      ];
    
    result["org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl/2686975282"] = [
        @org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/factconstraints/config/SimpleConstraintConfigurationImpl;),
      ];
    
    result["[Lorg.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl;/350650174"] = [
        @org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/factconstraints/config/SimpleConstraintConfigurationImpl;),
      ];
    
    result["[Lorg.drools.ide.common.client.factconstraints.customform.CustomFormConfiguration;/3475962636"] = [
        @org.drools.ide.common.client.factconstraints.customform.CustomFormConfiguration_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.customform.CustomFormConfiguration_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/factconstraints/customform/CustomFormConfiguration;),
      ];
    
    result["org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation/3157555692"] = [
        @org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/factconstraints/customform/predefined/DefaultCustomFormImplementation;),
      ];
    
    result["[Lorg.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation;/1265892387"] = [
        @org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/factconstraints/customform/predefined/DefaultCustomFormImplementation;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators/2589162898"] = [
        @org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/FieldAccessorsAndMutators;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.MethodInfo/4228331741"] = [
        @org.drools.ide.common.client.modeldriven.MethodInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.MethodInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/MethodInfo;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.MethodInfo;/3407967845"] = [
        @org.drools.ide.common.client.modeldriven.MethodInfo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.MethodInfo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/MethodInfo;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelAnnotation/624741904"] = [
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelAnnotation;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.ModelAnnotation;/3279465490"] = [
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/ModelAnnotation;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelField/2776426316"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelField$FIELD_CLASS_TYPE/3347163077"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_FIELD_CLASS_TYPE_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_FIELD_CLASS_TYPE_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelField$FIELD_CLASS_TYPE;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.ModelField;/3748451191"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/ModelField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine/1850545750"] = [
        @org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/SuggestionCompletionEngine;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionCallMethod/2622782319"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionCallMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionCallMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionCallMethod;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionCallMethod;/3105592198"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionCallMethod_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionCallMethod_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionCallMethod;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem/2404526606"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionExecuteWorkItem;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem;/3244030984"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionExecuteWorkItem;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction/1198320636"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionFieldFunction;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldFunction;/703722788"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionFieldFunction;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldList;/1772438865"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldList_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldList_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionFieldList;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionFieldValue/1079731453"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionFieldValue;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldValue;/359354978"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionFieldValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionFieldValue;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd/4043044705"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionGlobalCollectionAdd;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd;/15019224"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionGlobalCollectionAdd;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionInsertFact/3485905000"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionInsertFact;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionInsertFact;/1597148208"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionInsertFact;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact/723703586"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionInsertLogicalFact;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact;/1332273257"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionInsertLogicalFact;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionRetractFact/362474911"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionRetractFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionRetractFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionRetractFact;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionRetractFact;/1261058820"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionRetractFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionRetractFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionRetractFact;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionSetField/1122928867"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionSetField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionSetField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionSetField;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionSetField;/4277321282"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionSetField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionSetField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionSetField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ActionUpdateField/1802957884"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionUpdateField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionUpdateField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ActionUpdateField;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ActionUpdateField;/124748768"] = [
        @org.drools.ide.common.client.modeldriven.brl.ActionUpdateField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ActionUpdateField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ActionUpdateField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.BaseSingleFieldConstraint/2129049811"] = [
        @org.drools.ide.common.client.modeldriven.brl.BaseSingleFieldConstraint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.BaseSingleFieldConstraint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/BaseSingleFieldConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.CEPWindow/3804775327"] = [
        @org.drools.ide.common.client.modeldriven.brl.CEPWindow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.CEPWindow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/CEPWindow;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern/3404742173"] = [
        @org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/CompositeFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.CompositeFactPattern;/226572141"] = [
        @org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/CompositeFactPattern;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint/2162400456"] = [
        @org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/CompositeFieldConstraint;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint;/3641433374"] = [
        @org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/CompositeFieldConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint/1666331915"] = [
        @org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ConnectiveConstraint;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint;/593577209"] = [
        @org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ConnectiveConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue/238626618"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLComplexVariableValue;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue;/1005836454"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLComplexVariableValue;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLSentence/913758188"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLSentence;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLSentence;/3420683153"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLSentence;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLVariableValue/3073113996"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLVariableValue;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLVariableValue;/3004588284"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLVariableValue;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionCollection/195632210"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionCollection;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex/1060545254"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionCollectionIndex;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex;/82990354"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionCollectionIndex;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionCollection;/2970069305"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollection_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionCollection_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionCollection;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionField/109758183"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable/2758276204"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionFieldVariable;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable;/2948746369"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionFieldVariable;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionField;/1017467854"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine/1347741067"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionFormLine;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionFormLine;/2522834546"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionFormLine;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable/1276417585"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionGlobalVariable;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable;/2888363018"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionGlobalVariable;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionMethod/1096305399"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionMethod;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionMethod;/2855898416"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionMethod_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionMethod_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionMethod;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionPart;/1750494294"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionPart_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionPart_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionPart;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionText/2762933163"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionText_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionText_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionText;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionText;/745301842"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionText_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionText_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionText;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact/1708797980"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionUnboundFact;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact;/2044954478"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionUnboundFact;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.ExpressionVariable/1175411671"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionVariable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionVariable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/ExpressionVariable;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionVariable;/1359661942"] = [
        @org.drools.ide.common.client.modeldriven.brl.ExpressionVariable_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.ExpressionVariable_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/ExpressionVariable;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FactPattern/3489008761"] = [
        @org.drools.ide.common.client.modeldriven.brl.FactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FactPattern;/2614927811"] = [
        @org.drools.ide.common.client.modeldriven.brl.FactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FieldConstraint;/1164068853"] = [
        @org.drools.ide.common.client.modeldriven.brl.FieldConstraint_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FieldConstraint_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FieldConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FreeFormLine/348435320"] = [
        @org.drools.ide.common.client.modeldriven.brl.FreeFormLine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FreeFormLine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FreeFormLine;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FreeFormLine;/2755716939"] = [
        @org.drools.ide.common.client.modeldriven.brl.FreeFormLine_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FreeFormLine_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FreeFormLine;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern/2474681233"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FromAccumulateCompositeFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern;/1535847466"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FromAccumulateCompositeFactPattern;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern/2973331950"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FromCollectCompositeFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern;/1651547815"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FromCollectCompositeFactPattern;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern/4140234719"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FromCompositeFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern;/2005892178"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FromCompositeFactPattern;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern/1902122346"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/FromEntryPointFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern;/656818550"] = [
        @org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/FromEntryPointFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.IAction;/1925899866"] = [
        @org.drools.ide.common.client.modeldriven.brl.IAction_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.IAction_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/IAction;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.IFactPattern;/4101568284"] = [
        @org.drools.ide.common.client.modeldriven.brl.IFactPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.IFactPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/IFactPattern;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.IPattern;/2081624879"] = [
        @org.drools.ide.common.client.modeldriven.brl.IPattern_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.IPattern_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/IPattern;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.RuleAttribute/3064466825"] = [
        @org.drools.ide.common.client.modeldriven.brl.RuleAttribute_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.RuleAttribute_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/RuleAttribute;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.RuleAttribute;/1505201549"] = [
        @org.drools.ide.common.client.modeldriven.brl.RuleAttribute_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.RuleAttribute_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/RuleAttribute;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.RuleMetadata/1665630929"] = [
        @org.drools.ide.common.client.modeldriven.brl.RuleMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.RuleMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/RuleMetadata;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.RuleMetadata;/2498172598"] = [
        @org.drools.ide.common.client.modeldriven.brl.RuleMetadata_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.RuleMetadata_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/RuleMetadata;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.RuleModel/1745483261"] = [
        @org.drools.ide.common.client.modeldriven.brl.RuleModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.RuleModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/RuleModel;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint/838566278"] = [
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/SingleFieldConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide/3061240925"] = [
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/SingleFieldConstraintEBLeftSide;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide;/3935196624"] = [
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/SingleFieldConstraintEBLeftSide;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint;/2661501140"] = [
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/SingleFieldConstraint;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel/2552055335"] = [
        @org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/templates/TemplateModel;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.ActionCol/1617211935"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/ActionCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.ActionCol;/470888723"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/ActionCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol/2773025582"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/ActionInsertFactCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol;/824525882"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/ActionInsertFactCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol/3787070011"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/ActionRetractFactCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol;/344344669"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/ActionRetractFactCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol/4240902131"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/ActionSetFieldCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol;/1126624179"] = [
        @org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/ActionSetFieldCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.AttributeCol/692298354"] = [
        @org.drools.ide.common.client.modeldriven.dt.AttributeCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.AttributeCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/AttributeCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.AttributeCol;/3440104255"] = [
        @org.drools.ide.common.client.modeldriven.dt.AttributeCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.AttributeCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/AttributeCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.ConditionCol/51141723"] = [
        @org.drools.ide.common.client.modeldriven.dt.ConditionCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ConditionCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/ConditionCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.ConditionCol;/3404331543"] = [
        @org.drools.ide.common.client.modeldriven.dt.ConditionCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.ConditionCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/ConditionCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.DTColumnConfig/3176479209"] = [
        @org.drools.ide.common.client.modeldriven.dt.DTColumnConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.DTColumnConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/DTColumnConfig;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.GuidedDecisionTable/3327777843"] = [
        @org.drools.ide.common.client.modeldriven.dt.GuidedDecisionTable_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.GuidedDecisionTable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/GuidedDecisionTable;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt.MetadataCol/2847075904"] = [
        @org.drools.ide.common.client.modeldriven.dt.MetadataCol_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.MetadataCol_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt/MetadataCol;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt.MetadataCol;/633991451"] = [
        @org.drools.ide.common.client.modeldriven.dt.MetadataCol_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt.MetadataCol_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt/MetadataCol;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionCol52/4100749920"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionCol52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.ActionCol52;/1051127838"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionCol52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionCol52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/ActionCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52/157500292"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionInsertFactCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionRetractFactCol52/3945460625"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionRetractFactCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionRetractFactCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionRetractFactCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52/2528333667"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionSetFieldCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemCol52/2901617224"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionWorkItemCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemInsertFactCol52/3656227747"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemInsertFactCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemInsertFactCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionWorkItemInsertFactCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemSetFieldCol52/898284848"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemSetFieldCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemSetFieldCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ActionWorkItemSetFieldCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.AnalysisCol52/3649756403"] = [
        @org.drools.ide.common.client.modeldriven.dt52.AnalysisCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.AnalysisCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/AnalysisCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.AttributeCol52/3203742806"] = [
        @org.drools.ide.common.client.modeldriven.dt52.AttributeCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.AttributeCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/AttributeCol52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.AttributeCol52;/4211768331"] = [
        @org.drools.ide.common.client.modeldriven.dt52.AttributeCol52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.AttributeCol52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/AttributeCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn/253445535"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/BRLActionColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.BRLActionColumn;/3597564029"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/BRLActionColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn/1926596668"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/BRLActionVariableColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn;/1194494164"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/BRLActionVariableColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.BRLColumn;/2015205946"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/BRLColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn/2511628450"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/BRLConditionColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn;/1762500205"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/BRLConditionColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn/3788909799"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/BRLConditionVariableColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn;/992712814"] = [
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/BRLConditionVariableColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.CompositeColumn;/3846657905"] = [
        @org.drools.ide.common.client.modeldriven.dt52.CompositeColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.CompositeColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/CompositeColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.ConditionCol52/2899260390"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ConditionCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ConditionCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/ConditionCol52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.ConditionCol52;/1179899207"] = [
        @org.drools.ide.common.client.modeldriven.dt52.ConditionCol52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.ConditionCol52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/ConditionCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.DTCellValue52/2137952283"] = [
        @org.drools.ide.common.client.modeldriven.dt52.DTCellValue52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.DTCellValue52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/DTCellValue52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.DTCellValue52;/3955920777"] = [
        @org.drools.ide.common.client.modeldriven.dt52.DTCellValue52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.DTCellValue52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/DTCellValue52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52/3421708490"] = [
        @org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/DTColumnConfig52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.DTDataTypes52/3626966410"] = [
        @org.drools.ide.common.client.modeldriven.dt52.DTDataTypes52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.DTDataTypes52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/DTDataTypes52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.DescriptionCol52/4224347244"] = [
        @org.drools.ide.common.client.modeldriven.dt52.DescriptionCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.DescriptionCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/DescriptionCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52/982769274"] = [
        @org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/GuidedDecisionTable52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52$TableFormat/3104819584"] = [
        @org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52_TableFormat_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52_TableFormat_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/GuidedDecisionTable52$TableFormat;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52/2935449910"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryActionInsertFactCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionRetractFactCol52/1091234286"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionRetractFactCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionRetractFactCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryActionRetractFactCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52/463996714"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryActionSetFieldCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn/2037670919"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryBRLActionColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn;/4037413339"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryBRLActionColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn/1488214365"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryBRLConditionColumn;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn;/483476230"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryBRLConditionColumn;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52/3113665416"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryConditionCol52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52;/2592442006"] = [
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/LimitedEntryConditionCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.MetadataCol52/4286374386"] = [
        @org.drools.ide.common.client.modeldriven.dt52.MetadataCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.MetadataCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/MetadataCol52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.MetadataCol52;/3813482556"] = [
        @org.drools.ide.common.client.modeldriven.dt52.MetadataCol52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.MetadataCol52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/MetadataCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.Pattern52/2844458478"] = [
        @org.drools.ide.common.client.modeldriven.dt52.Pattern52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.Pattern52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/Pattern52;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.dt52.Pattern52;/442781767"] = [
        @org.drools.ide.common.client.modeldriven.dt52.Pattern52_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.Pattern52_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/dt52/Pattern52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52/1261256340"] = [
        @org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/dt52/RowNumberCol52;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup/2773202647"] = [
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/ActivateRuleFlowGroup;),
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/ActivateRuleFlowGroup;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup;/353249513"] = [
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/ActivateRuleFlowGroup;),
        @org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/ActivateRuleFlowGroup;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.CallFieldValue/815130477"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/CallFieldValue;),
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/CallFieldValue;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.CallFieldValue;/729424697"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/CallFieldValue;),
        @org.drools.ide.common.client.modeldriven.testing.CallFieldValue_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/CallFieldValue;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.CallFixtureMap/893403420"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/CallFixtureMap;),
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/CallFixtureMap;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.CallFixtureMap;/2305265629"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/CallFixtureMap;),
        @org.drools.ide.common.client.modeldriven.testing.CallFixtureMap_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/CallFixtureMap;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.CallMethod/2940017908"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/CallMethod;),
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/CallMethod;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.CallMethod;/3435995888"] = [
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/CallMethod;),
        @org.drools.ide.common.client.modeldriven.testing.CallMethod_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/CallMethod;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.ExecutionTrace/1526973865"] = [
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/ExecutionTrace;),
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/ExecutionTrace;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.ExecutionTrace;/4040252617"] = [
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/ExecutionTrace;),
        @org.drools.ide.common.client.modeldriven.testing.ExecutionTrace_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/ExecutionTrace;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.Expectation;/1314945726"] = [
        @org.drools.ide.common.client.modeldriven.testing.Expectation_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.Expectation_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/Expectation;),
        @org.drools.ide.common.client.modeldriven.testing.Expectation_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/Expectation;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.Fact/3435674572"] = [
        @org.drools.ide.common.client.modeldriven.testing.Fact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.Fact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/Fact;),
        @org.drools.ide.common.client.modeldriven.testing.Fact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/Fact;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.FactAssignmentField/3119555216"] = [
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/FactAssignmentField;),
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/FactAssignmentField;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.FactAssignmentField;/3059075505"] = [
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/FactAssignmentField;),
        @org.drools.ide.common.client.modeldriven.testing.FactAssignmentField_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/FactAssignmentField;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.FactData/2625488178"] = [
        @org.drools.ide.common.client.modeldriven.testing.FactData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FactData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/FactData;),
        @org.drools.ide.common.client.modeldriven.testing.FactData_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/FactData;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.FactData;/1875533850"] = [
        @org.drools.ide.common.client.modeldriven.testing.FactData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FactData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/FactData;),
        @org.drools.ide.common.client.modeldriven.testing.FactData_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/FactData;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.FieldData/3078684231"] = [
        @org.drools.ide.common.client.modeldriven.testing.FieldData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FieldData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/FieldData;),
        @org.drools.ide.common.client.modeldriven.testing.FieldData_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/FieldData;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.FieldData;/672129968"] = [
        @org.drools.ide.common.client.modeldriven.testing.FieldData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FieldData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/FieldData;),
        @org.drools.ide.common.client.modeldriven.testing.FieldData_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/FieldData;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.Field;/3530202436"] = [
        @org.drools.ide.common.client.modeldriven.testing.Field_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.Field_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/Field;),
        @org.drools.ide.common.client.modeldriven.testing.Field_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/Field;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.FixtureList/1101508449"] = [
        @org.drools.ide.common.client.modeldriven.testing.FixtureList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FixtureList_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/FixtureList;),
        @org.drools.ide.common.client.modeldriven.testing.FixtureList_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/FixtureList;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.Fixture;/437688576"] = [
        @org.drools.ide.common.client.modeldriven.testing.Fixture_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.Fixture_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/Fixture;),
        @org.drools.ide.common.client.modeldriven.testing.Fixture_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/Fixture;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.FixturesMap/2654550749"] = [
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/FixturesMap;),
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/FixturesMap;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.FixturesMap;/401636883"] = [
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/FixturesMap;),
        @org.drools.ide.common.client.modeldriven.testing.FixturesMap_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/FixturesMap;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.RetractFact/1576843428"] = [
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/RetractFact;),
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/RetractFact;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.RetractFact;/4098101510"] = [
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/RetractFact;),
        @org.drools.ide.common.client.modeldriven.testing.RetractFact_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/RetractFact;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.Scenario/3601385176"] = [
        @org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/Scenario;),
        @org.drools.ide.common.client.modeldriven.testing.Scenario_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/Scenario;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.VerifyFact/3505438502"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/VerifyFact;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/VerifyFact;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.VerifyFact;/1754246068"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyFact;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyFact_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyFact;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.VerifyField/699842807"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/VerifyField;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/VerifyField;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.VerifyField;/1175801529"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyField;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyField_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyField;)
      ];
    
    result["org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired/682384444"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/testing/VerifyRuleFired;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/testing/VerifyRuleFired;)
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.testing.VerifyRuleFired;/2107604025"] = [
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyRuleFired;),
        @org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/modeldriven/testing/VerifyRuleFired;)
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition/58438741"] = [
        @org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableBooleanParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition/1191121563"] = [
        @org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableEnumParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition/347556554"] = [
        @org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableFloatParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition/2741030255"] = [
        @org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableIntegerParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableListParameterDefinition/1910870545"] = [
        @org.drools.ide.common.shared.workitems.PortableListParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableListParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableListParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition/2506839583"] = [
        @org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableObjectParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableStringParameterDefinition/2272465890"] = [
        @org.drools.ide.common.shared.workitems.PortableStringParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableStringParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableStringParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableWorkDefinition/1592110834"] = [
        @org.drools.ide.common.shared.workitems.PortableWorkDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableWorkDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableWorkDefinition;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.dnd.client.DragHandlerCollection::class)] = "com.allen_sauer.gwt.dnd.client.DragHandlerCollection/3996089253";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/119490835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/3088681894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3174178888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/465158911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion::class)] = "com.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion/2803420099";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MultiWordSuggestOracle.MultiWordSuggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.MultiWordSuggestOracle$MultiWordSuggestion;/1531882420";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/1920131050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/210686268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Request::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Request/3707347745";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Response::class)] = "com.google.gwt.user.client.ui.SuggestOracle$Response/3840253928";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.SuggestOracle.Suggestion[]::class)] = "[Lcom.google.gwt.user.client.ui.SuggestOracle$Suggestion;/3224244884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/3768293299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/2254740473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/3716243734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte::class)] = "java.lang.Byte/1571082439";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short::class)] = "java.lang.Short/551743396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[][]::class)] = "[[Ljava.lang.String;/4182515373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigDecimal::class)] = "java.math.BigDecimal/8151472";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.math.BigInteger::class)] = "java.math.BigInteger/927293797";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.AbstractList[]::class)] = "[Ljava.util.AbstractList;/727920111";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.AbstractSequentialList[]::class)] = "[Ljava.util.AbstractSequentialList;/3144020509";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList[]::class)] = "[Ljava.util.ArrayList;/2683379088";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyMap::class)] = "java.util.Collections$EmptyMap/4174664486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList[]::class)] = "[Ljava.util.LinkedList;/1037437294";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.List[]::class)] = "[Ljava.util.List;/2827171268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack[]::class)] = "[Ljava.util.Stack;/675459124";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector[]::class)] = "[Ljava.util.Vector;/3889776585";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection::class)] = "org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection/2634479852";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection[]::class)] = "[Lorg.cobogw.gwt.user.client.rpc.AsyncCallbackCollection;/2203013177";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.PropertiesHolder::class)] = "org.drools.guvnor.client.asseteditor.PropertiesHolder/3220464228";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.PropertyHolder::class)] = "org.drools.guvnor.client.asseteditor.PropertyHolder/138851633";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.PropertyHolder[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.PropertyHolder;/3463468498";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel::class)] = "org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel/3651081605";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.AnnotationMetaModel;/2643586691";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel::class)] = "org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel/717485726";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.FactMetaModel;/2250982735";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.FactModels::class)] = "org.drools.guvnor.client.asseteditor.drools.factmodel.FactModels/129987162";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel::class)] = "org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel/2435745324";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.drools.factmodel.FieldMetaModel;/702608451";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter::class)] = "org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter/3755041370";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssertBehaviorOption::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssertBehaviorOption/3303424521";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssetReference::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.AssetReference/3504811494";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ClockType::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ClockType/3149665656";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.EventProcessingOption::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.EventProcessingOption/3262079858";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ListenerType::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ListenerType/91118168";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.MarshallingOption::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.MarshallingOption/591863003";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ProtocolOption::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ProtocolOption/1697776378";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceConfig::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceConfig/1718986263";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKAgentConfig::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKAgentConfig/3276528542";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKBaseConfig::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKBaseConfig/3886992660";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKSessionConfig::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.ServiceKSessionConfig/2307904333";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.serviceconfig.SessionType::class)] = "org.drools.guvnor.client.asseteditor.drools.serviceconfig.SessionType/3243758077";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode/1424972328";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.ElementContainerTransferNode;/3809754860";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode/3726411311";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.HumanTaskTransferNode;/446345653";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.SplitNode.ConnectionRef::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.SplitNode$ConnectionRef/3576963957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.SplitNode.Constraint::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.SplitNode$Constraint/4028603467";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode/3651508595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode.Type::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode$Type/4244380074";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.SplitTransferNode;/2285811217";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection/3080672814";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.TransferConnection[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.TransferConnection;/2621459290";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.TransferNode::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.TransferNode/469691896";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.TransferNode.Type::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.TransferNode$Type/2240396873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.TransferNode[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.TransferNode;/4024066103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode::class)] = "org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode/73365898";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode[]::class)] = "[Lorg.drools.guvnor.client.asseteditor.ruleflow.WorkItemTransferNode;/545310491";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.common.RdbmsConfigurable::class)] = "org.drools.guvnor.client.common.RdbmsConfigurable/1439703124";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AbstractAssetPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.AbstractAssetPageRow;/2168433150";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AbstractPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.AbstractPageRow;/4168434293";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AdminArchivedPageRow::class)] = "org.drools.guvnor.client.rpc.AdminArchivedPageRow/4200366411";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AdminArchivedPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.AdminArchivedPageRow;/3296282530";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisFactUsage::class)] = "org.drools.guvnor.client.rpc.AnalysisFactUsage/2366837231";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisFactUsage[]::class)] = "[Lorg.drools.guvnor.client.rpc.AnalysisFactUsage;/2448927722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisFieldUsage::class)] = "org.drools.guvnor.client.rpc.AnalysisFieldUsage/4238632060";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisFieldUsage[]::class)] = "[Lorg.drools.guvnor.client.rpc.AnalysisFieldUsage;/2756149784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisReport::class)] = "org.drools.guvnor.client.rpc.AnalysisReport/2987744465";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisReportLine::class)] = "org.drools.guvnor.client.rpc.AnalysisReportLine/2253191678";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AnalysisReportLine[]::class)] = "[Lorg.drools.guvnor.client.rpc.AnalysisReportLine;/2393762904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Artifact::class)] = "org.drools.guvnor.client.rpc.Artifact/2312170343";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Asset::class)] = "org.drools.guvnor.client.rpc.Asset/2594588063";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AssetPageRequest::class)] = "org.drools.guvnor.client.rpc.AssetPageRequest/4043140489";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AssetPageRow::class)] = "org.drools.guvnor.client.rpc.AssetPageRow/2218996587";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AssetPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.AssetPageRow;/667490531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BuilderResult::class)] = "org.drools.guvnor.client.rpc.BuilderResult/1387203461";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BuilderResultLine::class)] = "org.drools.guvnor.client.rpc.BuilderResultLine/2861242005";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BuilderResultLine[]::class)] = "[Lorg.drools.guvnor.client.rpc.BuilderResultLine;/2572161422";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BulkTestRunResult::class)] = "org.drools.guvnor.client.rpc.BulkTestRunResult/2982311969";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.CategoryPageRequest::class)] = "org.drools.guvnor.client.rpc.CategoryPageRequest/1553084883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.CategoryPageRow::class)] = "org.drools.guvnor.client.rpc.CategoryPageRow/2703166588";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.CategoryPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.CategoryPageRow;/68289104";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Cause::class)] = "org.drools.guvnor.client.rpc.Cause/403456510";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Cause[]::class)] = "[Lorg.drools.guvnor.client.rpc.Cause;/936858851";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult::class)] = "org.drools.guvnor.client.rpc.ConversionResult/1748942422";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult.ConversionAsset::class)] = "org.drools.guvnor.client.rpc.ConversionResult$ConversionAsset/49399373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult.ConversionAsset[]::class)] = "[Lorg.drools.guvnor.client.rpc.ConversionResult$ConversionAsset;/1722130527";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult.ConversionMessage::class)] = "org.drools.guvnor.client.rpc.ConversionResult$ConversionMessage/1585621227";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult.ConversionMessageType::class)] = "org.drools.guvnor.client.rpc.ConversionResult$ConversionMessageType/151430246";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResult.ConversionMessage[]::class)] = "[Lorg.drools.guvnor.client.rpc.ConversionResult$ConversionMessage;/2545938738";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ConversionResultNoConverter::class)] = "org.drools.guvnor.client.rpc.ConversionResultNoConverter/2661705921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.DependenciesPageRow::class)] = "org.drools.guvnor.client.rpc.DependenciesPageRow/3021521934";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.DependenciesPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.DependenciesPageRow;/3375478817";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.DetailedSerializationException::class)] = "org.drools.guvnor.client.rpc.DetailedSerializationException/4010081135";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.DiscussionRecord::class)] = "org.drools.guvnor.client.rpc.DiscussionRecord/1866698412";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.FormContentModel::class)] = "org.drools.guvnor.client.rpc.FormContentModel/2502097592";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxIncomingPageRow::class)] = "org.drools.guvnor.client.rpc.InboxIncomingPageRow/1678049514";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxIncomingPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.InboxIncomingPageRow;/2215392433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRequest::class)] = "org.drools.guvnor.client.rpc.InboxPageRequest/2902001826";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRow::class)] = "org.drools.guvnor.client.rpc.InboxPageRow/2762426230";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.InboxPageRow;/2644115897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogEntry::class)] = "org.drools.guvnor.client.rpc.LogEntry/752151946";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogPageRow::class)] = "org.drools.guvnor.client.rpc.LogPageRow/1286904464";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.LogPageRow;/3205332377";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MavenArtifact::class)] = "org.drools.guvnor.client.rpc.MavenArtifact/1138584451";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MavenArtifact[]::class)] = "[Lorg.drools.guvnor.client.rpc.MavenArtifact;/3390988313";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MetaData::class)] = "org.drools.guvnor.client.rpc.MetaData/2769241471";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MetaDataQuery::class)] = "org.drools.guvnor.client.rpc.MetaDataQuery/3433133509";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MetaDataQuery[]::class)] = "[Lorg.drools.guvnor.client.rpc.MetaDataQuery;/2168760287";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Module::class)] = "org.drools.guvnor.client.rpc.Module/3987908514";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.Module[]::class)] = "[Lorg.drools.guvnor.client.rpc.Module;/1835845701";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.NewAssetConfiguration::class)] = "org.drools.guvnor.client.rpc.NewAssetConfiguration/2985301202";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration::class)] = "org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration/4274860629";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PageRequest::class)] = "org.drools.guvnor.client.rpc.PageRequest/2522979705";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PageResponse::class)] = "org.drools.guvnor.client.rpc.PageResponse/1139529059";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PermissionsPageRow::class)] = "org.drools.guvnor.client.rpc.PermissionsPageRow/1300018583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PermissionsPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.PermissionsPageRow;/3744666246";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PushResponse::class)] = "org.drools.guvnor.client.rpc.PushResponse/3692768440";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryMetadataPageRequest::class)] = "org.drools.guvnor.client.rpc.QueryMetadataPageRequest/1696980185";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRequest::class)] = "org.drools.guvnor.client.rpc.QueryPageRequest/2463488132";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRow::class)] = "org.drools.guvnor.client.rpc.QueryPageRow/1680853655";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.QueryPageRow;/3556272876";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.RuleContentText::class)] = "org.drools.guvnor.client.rpc.RuleContentText/3326806597";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.RuleFlowContentModel::class)] = "org.drools.guvnor.client.rpc.RuleFlowContentModel/427407354";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ScenarioResultSummary::class)] = "org.drools.guvnor.client.rpc.ScenarioResultSummary/2334378227";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ScenarioResultSummary[]::class)] = "[Lorg.drools.guvnor.client.rpc.ScenarioResultSummary;/3871459632";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ScenarioRunResult::class)] = "org.drools.guvnor.client.rpc.ScenarioRunResult/922476082";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SessionExpiredException::class)] = "org.drools.guvnor.client.rpc.SessionExpiredException/3663857784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SingleScenarioResult::class)] = "org.drools.guvnor.client.rpc.SingleScenarioResult/1659547457";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest::class)] = "org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest/4008526572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse::class)] = "org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse/1041574609";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotComparisonPageRow::class)] = "org.drools.guvnor.client.rpc.SnapshotComparisonPageRow/2222855516";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotComparisonPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.SnapshotComparisonPageRow;/22188732";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotDiff::class)] = "org.drools.guvnor.client.rpc.SnapshotDiff/4059157476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotDiff[]::class)] = "[Lorg.drools.guvnor.client.rpc.SnapshotDiff;/749597884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotDiffs::class)] = "org.drools.guvnor.client.rpc.SnapshotDiffs/1138021021";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotInfo::class)] = "org.drools.guvnor.client.rpc.SnapshotInfo/3941689836";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotInfo[]::class)] = "[Lorg.drools.guvnor.client.rpc.SnapshotInfo;/820892288";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRequest::class)] = "org.drools.guvnor.client.rpc.StatePageRequest/1905711895";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRow::class)] = "org.drools.guvnor.client.rpc.StatePageRow/443879953";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.StatePageRow;/3324871288";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableConfig::class)] = "org.drools.guvnor.client.rpc.TableConfig/4030672863";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataResult::class)] = "org.drools.guvnor.client.rpc.TableDataResult/2516166606";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataRow::class)] = "org.drools.guvnor.client.rpc.TableDataRow/4008720411";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.TableDataRow;/2256388940";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.UserSecurityContext::class)] = "org.drools.guvnor.client.rpc.UserSecurityContext/1012666777";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.ValidatedResponse::class)] = "org.drools.guvnor.client.rpc.ValidatedResponse/1450137662";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.WorkingSetConfigData::class)] = "org.drools.guvnor.client.rpc.WorkingSetConfigData/35990901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.WorkingSetConfigData[]::class)] = "[Lorg.drools.guvnor.client.rpc.WorkingSetConfigData;/3474841627";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern::class)] = "org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern/3703630433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern[]::class)] = "[Lorg.drools.guvnor.client.widgets.drools.wizards.assets.decisiontable.ActionInsertFactFieldsPattern;/672007427";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.ConstraintConfiguration[]::class)] = "[Lorg.drools.ide.common.client.factconstraints.ConstraintConfiguration;/1130577655";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl::class)] = "org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl/2686975282";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl[]::class)] = "[Lorg.drools.ide.common.client.factconstraints.config.SimpleConstraintConfigurationImpl;/350650174";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.customform.CustomFormConfiguration[]::class)] = "[Lorg.drools.ide.common.client.factconstraints.customform.CustomFormConfiguration;/3475962636";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation::class)] = "org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation/3157555692";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation[]::class)] = "[Lorg.drools.ide.common.client.factconstraints.customform.predefined.DefaultCustomFormImplementation;/1265892387";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators::class)] = "org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators/2589162898";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.MethodInfo::class)] = "org.drools.ide.common.client.modeldriven.MethodInfo/4228331741";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.MethodInfo[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.MethodInfo;/3407967845";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelAnnotation::class)] = "org.drools.ide.common.client.modeldriven.ModelAnnotation/624741904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelAnnotation[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.ModelAnnotation;/3279465490";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField::class)] = "org.drools.ide.common.client.modeldriven.ModelField/2776426316";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField.FIELD_CLASS_TYPE::class)] = "org.drools.ide.common.client.modeldriven.ModelField$FIELD_CLASS_TYPE/3347163077";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.ModelField;/3748451191";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine::class)] = "org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine/1850545750";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionCallMethod::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionCallMethod/2622782319";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionCallMethod[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionCallMethod;/3105592198";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem/2404526606";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionExecuteWorkItem;/3244030984";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction/1198320636";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionFieldFunction[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldFunction;/703722788";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionFieldList[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldList;/1772438865";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionFieldValue::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionFieldValue/1079731453";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionFieldValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionFieldValue;/359354978";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd/4043044705";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionGlobalCollectionAdd;/15019224";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionInsertFact::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionInsertFact/3485905000";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionInsertFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionInsertFact;/1597148208";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact/723703586";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionInsertLogicalFact;/1332273257";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionRetractFact::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionRetractFact/362474911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionRetractFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionRetractFact;/1261058820";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionSetField::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionSetField/1122928867";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionSetField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionSetField;/4277321282";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionUpdateField::class)] = "org.drools.ide.common.client.modeldriven.brl.ActionUpdateField/1802957884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ActionUpdateField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ActionUpdateField;/124748768";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.BaseSingleFieldConstraint::class)] = "org.drools.ide.common.client.modeldriven.brl.BaseSingleFieldConstraint/2129049811";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.CEPWindow::class)] = "org.drools.ide.common.client.modeldriven.brl.CEPWindow/3804775327";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern/3404742173";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.CompositeFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.CompositeFactPattern;/226572141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint::class)] = "org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint/2162400456";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.CompositeFieldConstraint;/3641433374";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint::class)] = "org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint/1666331915";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ConnectiveConstraint;/593577209";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue/238626618";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue;/1005836454";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLSentence::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLSentence/913758188";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLSentence[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLSentence;/3420683153";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLVariableValue::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLVariableValue/3073113996";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLVariableValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLVariableValue;/3004588284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionCollection::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionCollection/195632210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex/1060545254";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionCollectionIndex;/82990354";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionCollection[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionCollection;/2970069305";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionField::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionField/109758183";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable/2758276204";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionFieldVariable;/2948746369";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionField;/1017467854";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine/1347741067";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionFormLine[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionFormLine;/2522834546";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable/1276417585";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionGlobalVariable;/2888363018";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionMethod::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionMethod/1096305399";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionMethod[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionMethod;/2855898416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionPart[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionPart;/1750494294";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionText::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionText/2762933163";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionText[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionText;/745301842";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact/1708797980";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionUnboundFact;/2044954478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionVariable::class)] = "org.drools.ide.common.client.modeldriven.brl.ExpressionVariable/1175411671";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.ExpressionVariable[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.ExpressionVariable;/1359661942";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.FactPattern/3489008761";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FactPattern;/2614927811";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FieldConstraint[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FieldConstraint;/1164068853";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FreeFormLine::class)] = "org.drools.ide.common.client.modeldriven.brl.FreeFormLine/348435320";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FreeFormLine[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FreeFormLine;/2755716939";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern/2474681233";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FromAccumulateCompositeFactPattern;/1535847466";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern/2973331950";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FromCollectCompositeFactPattern;/1651547815";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern/4140234719";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FromCompositeFactPattern;/2005892178";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern::class)] = "org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern/1902122346";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.FromEntryPointFactPattern;/656818550";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.IAction[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.IAction;/1925899866";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.IFactPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.IFactPattern;/4101568284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.IPattern[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.IPattern;/2081624879";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.RuleAttribute::class)] = "org.drools.ide.common.client.modeldriven.brl.RuleAttribute/3064466825";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.RuleAttribute[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.RuleAttribute;/1505201549";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.RuleMetadata::class)] = "org.drools.ide.common.client.modeldriven.brl.RuleMetadata/1665630929";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.RuleMetadata[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.RuleMetadata;/2498172598";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.RuleModel::class)] = "org.drools.ide.common.client.modeldriven.brl.RuleModel/1745483261";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint::class)] = "org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint/838566278";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide::class)] = "org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide/3061240925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.SingleFieldConstraintEBLeftSide;/3935196624";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.SingleFieldConstraint;/2661501140";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel::class)] = "org.drools.ide.common.client.modeldriven.brl.templates.TemplateModel/2552055335";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionCol::class)] = "org.drools.ide.common.client.modeldriven.dt.ActionCol/1617211935";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.ActionCol;/470888723";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol::class)] = "org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol/2773025582";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.ActionInsertFactCol;/824525882";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol::class)] = "org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol/3787070011";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.ActionRetractFactCol;/344344669";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol::class)] = "org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol/4240902131";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.ActionSetFieldCol;/1126624179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.AttributeCol::class)] = "org.drools.ide.common.client.modeldriven.dt.AttributeCol/692298354";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.AttributeCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.AttributeCol;/3440104255";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ConditionCol::class)] = "org.drools.ide.common.client.modeldriven.dt.ConditionCol/51141723";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.ConditionCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.ConditionCol;/3404331543";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.DTColumnConfig::class)] = "org.drools.ide.common.client.modeldriven.dt.DTColumnConfig/3176479209";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.GuidedDecisionTable::class)] = "org.drools.ide.common.client.modeldriven.dt.GuidedDecisionTable/3327777843";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.MetadataCol::class)] = "org.drools.ide.common.client.modeldriven.dt.MetadataCol/2847075904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt.MetadataCol[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt.MetadataCol;/633991451";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionCol52/4100749920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionCol52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.ActionCol52;/1051127838";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionInsertFactCol52/157500292";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionRetractFactCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionRetractFactCol52/3945460625";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionSetFieldCol52/2528333667";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemCol52/2901617224";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemInsertFactCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemInsertFactCol52/3656227747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemSetFieldCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ActionWorkItemSetFieldCol52/898284848";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.AnalysisCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.AnalysisCol52/3649756403";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.AttributeCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.AttributeCol52/3203742806";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.AttributeCol52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.AttributeCol52;/4211768331";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn/253445535";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLActionColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.BRLActionColumn;/3597564029";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn/1926596668";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.BRLActionVariableColumn;/1194494164";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.BRLColumn;/2015205946";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn/2511628450";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.BRLConditionColumn;/1762500205";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn/3788909799";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.BRLConditionVariableColumn;/992712814";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.CompositeColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.CompositeColumn;/3846657905";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ConditionCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.ConditionCol52/2899260390";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.ConditionCol52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.ConditionCol52;/1179899207";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.DTCellValue52::class)] = "org.drools.ide.common.client.modeldriven.dt52.DTCellValue52/2137952283";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.DTCellValue52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.DTCellValue52;/3955920777";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52::class)] = "org.drools.ide.common.client.modeldriven.dt52.DTColumnConfig52/3421708490";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.DTDataTypes52::class)] = "org.drools.ide.common.client.modeldriven.dt52.DTDataTypes52/3626966410";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.DescriptionCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.DescriptionCol52/4224347244";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52::class)] = "org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52/982769274";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52.TableFormat::class)] = "org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52$TableFormat/3104819584";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionInsertFactCol52/2935449910";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionRetractFactCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionRetractFactCol52/1091234286";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryActionSetFieldCol52/463996714";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn/2037670919";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLActionColumn;/4037413339";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn/1488214365";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryBRLConditionColumn;/483476230";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52/3113665416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.LimitedEntryConditionCol52;/2592442006";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.MetadataCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.MetadataCol52/4286374386";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.MetadataCol52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.MetadataCol52;/3813482556";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.Pattern52::class)] = "org.drools.ide.common.client.modeldriven.dt52.Pattern52/2844458478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.Pattern52[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.dt52.Pattern52;/442781767";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52::class)] = "org.drools.ide.common.client.modeldriven.dt52.RowNumberCol52/1261256340";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup::class)] = "org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup/2773202647";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.ActivateRuleFlowGroup;/353249513";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallFieldValue::class)] = "org.drools.ide.common.client.modeldriven.testing.CallFieldValue/815130477";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallFieldValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.CallFieldValue;/729424697";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallFixtureMap::class)] = "org.drools.ide.common.client.modeldriven.testing.CallFixtureMap/893403420";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallFixtureMap[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.CallFixtureMap;/2305265629";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallMethod::class)] = "org.drools.ide.common.client.modeldriven.testing.CallMethod/2940017908";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.CallMethod[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.CallMethod;/3435995888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.ExecutionTrace::class)] = "org.drools.ide.common.client.modeldriven.testing.ExecutionTrace/1526973865";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.ExecutionTrace[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.ExecutionTrace;/4040252617";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.Expectation[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.Expectation;/1314945726";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.Fact::class)] = "org.drools.ide.common.client.modeldriven.testing.Fact/3435674572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FactAssignmentField::class)] = "org.drools.ide.common.client.modeldriven.testing.FactAssignmentField/3119555216";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FactAssignmentField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.FactAssignmentField;/3059075505";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FactData::class)] = "org.drools.ide.common.client.modeldriven.testing.FactData/2625488178";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FactData[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.FactData;/1875533850";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FieldData::class)] = "org.drools.ide.common.client.modeldriven.testing.FieldData/3078684231";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FieldData[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.FieldData;/672129968";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.Field[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.Field;/3530202436";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FixtureList::class)] = "org.drools.ide.common.client.modeldriven.testing.FixtureList/1101508449";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.Fixture[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.Fixture;/437688576";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FixturesMap::class)] = "org.drools.ide.common.client.modeldriven.testing.FixturesMap/2654550749";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.FixturesMap[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.FixturesMap;/401636883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.RetractFact::class)] = "org.drools.ide.common.client.modeldriven.testing.RetractFact/1576843428";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.RetractFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.RetractFact;/4098101510";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.Scenario::class)] = "org.drools.ide.common.client.modeldriven.testing.Scenario/3601385176";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyFact::class)] = "org.drools.ide.common.client.modeldriven.testing.VerifyFact/3505438502";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyFact[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.VerifyFact;/1754246068";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyField::class)] = "org.drools.ide.common.client.modeldriven.testing.VerifyField/699842807";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.VerifyField;/1175801529";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired::class)] = "org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired/682384444";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.testing.VerifyRuleFired[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.testing.VerifyRuleFired;/2107604025";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition/58438741";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition/1191121563";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition/347556554";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition/2741030255";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableListParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableListParameterDefinition/1910870545";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition/2506839583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableStringParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableStringParameterDefinition/2272465890";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableWorkDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableWorkDefinition/1592110834";
    return result;
  }-*/;
  
  public ModuleService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}