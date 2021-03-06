package ru.netology.data

data class Video (
//    идентификатор видеозаписи
    val id: Int,
//    идентификатор владельца видеозаписи
    val ownerId: Int,
//    название видеозаписи
    val title: String,
//    текст описания видеозаписи
    val description: String,
//    длительность ролика в секундах
    val duration: Int,
//    Изображение обложки
    val image: Array<Image>,
//    Изображение первого кадра
    val firstFrame: Array<FirstFrame>,
//    дата создания видеозаписи в формате Unixtime
    val date: Int,
//    дата добавления видеозаписи пользователем или группой в формате Unixtime
    val addingDate: Int,
//    количество просмотров видеозаписи.
    val views: Int,
//    Если видео внешнее, количество просмотров в ВК.
    val localViews: Int,
//количество комментариев к видеозаписи
    val comments: Int,
//    URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере.
//    Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    val player: String,
//    название платформы (для видеозаписей, добавленных с внешних сайтов)
    val platform: String,
//    Может ли пользователь добавить видеозапись к себе
    val canAdd: Boolean,
//    поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение),
//    всегда содержит true.
    val isPrivate: Boolean,
//    ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
    val accessKey: String,
//    поле возвращается в том случае, если видеоролик находится в процессе обработки,
//    всегда содержит true.
    val processing: Boolean,
//    true, если объект добавлен в закладки у текущего пользователя.
    val isFavorite: Boolean,
//    Может ли пользователь комментировать видео
    val canComment: Boolean,
//    Может ли пользователь редактировать видео
    val canEdit: Boolean,
//    Может ли пользователь добавить видео в список <<Мне нравится>>
    val canLike: Boolean,
//    Может ли пользователь сделать репост видео
    val canRepost: Boolean,
//    Может ли пользователь подписаться на автора видео
    val canSubscribe: Boolean,
//    Может ли пользователь добавить видео в избранное
    val canAddToFaves: Boolean,
//    Может ли пользователь прикрепить кнопку действия к видео
    val canAtachLink: Boolean,
//    Ширина видео
    val width: Int,
//    Высота видео
    val height: Int,
//    Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
    val userId: Int,
//    Конвертируется ли видео
    val converting: Boolean,
//   Добавлено ли видео в альбомы пользователя.
    val added: Boolean,
//    Подписан ли пользователь на автора видео
    val isSubscribed: Boolean,
//    поле возвращается в том случае, если видео зациклено, всегда содержит true
    val repeat: Boolean,
//    Тип видеозаписи. Может принимать значения: "video", "musicVideo", "movie".
    val type: String,
//    Баланс донатов в прямой трансляции.
    val balance: Int,
//    Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished", "failed", "upcoming".
    val liveStatus: String,
//    поле возвращается в том случае, если видеозапись является прямой трансляцией,
//    всегда содержит true. Обратите внимание, в этом случае в поле duration содержится значение 0.
    val live: Boolean,
//    (для live = true). Поле свидетельствует о том, что трансляция скоро начнётся.
    val upcoming: Boolean,
//    Количество зрителей прямой трансляции.
    val spectators: Int
)
